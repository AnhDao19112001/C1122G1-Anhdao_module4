package com.example.book_loan_app.controller;

import com.example.book_loan_app.logger.BookException;
import com.example.book_loan_app.model.Book;
import com.example.book_loan_app.model.Oder;
import com.example.book_loan_app.service.IBookService;
import com.example.book_loan_app.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Random;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOderService oderService;

    @GetMapping("")
    public String showList(Model model) {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "/list";
    }

    @GetMapping("/info/{id}")
    public String showOder(@PathVariable int id, Model model) throws BookException {
        Book book = bookService.findById(id);
        if (book.getQuantity() == 0) {
            throw new BookException();
        } else {
            model.addAttribute("book", book);
            return "borrow";
        }
    }

    @PostMapping("/borrow")
    public String OderBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        book.setQuantity(book.getQuantity() - 1);
        bookService.save(book);

        String loanCode = String.valueOf(new Random().nextInt(90000) + 10000);
        Oder oder = new Oder(loanCode, book.getId());
        oderService.save(oder);

        redirectAttributes.addFlashAttribute("msg", "bạn đã mượn thành công sách: " + book.getName() + " Mã mượn sách là: " + loanCode);
        return "redirect:/";
    }

    @GetMapping("/pay_book")
    public String showFormPay() {
        return "/pay";
    }

    @PostMapping("/pay")
    public String getPayBook(@RequestParam String code, RedirectAttributes redirectAttributes) {
        Oder oder = oderService.findByCode(code);
        if (oder == null) {
            redirectAttributes.addAttribute("msg", "Mã mượn sách không đúng vui lòng nhập lại!");
            return "redirect:/pay_book";
        } else {
            Book book = bookService.findById(oder.getBookId());
            book.setQuantity(book.getQuantity() + 1);
            bookService.save(book);
            oderService.delete(oder.getId());
            redirectAttributes.addAttribute("msg", "Đã trả sách thành công! " + book.getName());
            return "/redirect:/";
        }
    }

    @ExceptionHandler(BookException.class)
    public String showError() {
        return "/error";
    }
}
