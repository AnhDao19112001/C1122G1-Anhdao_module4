package com.example.book_loan_app.controller;

import com.example.book_loan_app.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("/")
    public String showList(Model model){
         model.addAttribute("books", this.bookService.findAll());
         return "list";
    }
}
