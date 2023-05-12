package com.example.book_loan_app.service.impl;

import com.example.book_loan_app.model.Book;
import com.example.book_loan_app.model.Oder;
import com.example.book_loan_app.repository.IBookRepository;
import com.example.book_loan_app.repository.IOderRepository;
import com.example.book_loan_app.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;
    @Autowired
    private IOderRepository oderRepository;
    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return iBookRepository.findById(id);
    }
    @Override
    public boolean findByCode(String code) {
        Oder oder =  this.oderRepository.findByCode(code);
        Book book = this.iBookRepository.findById(oder.getBook().getId()).orElse(null);
        book.setQuantity(book.getQuantity()+1);
        iBookRepository.save(book);
        oderRepository.deleteById(oder.getId());
        return true;
    }

}
