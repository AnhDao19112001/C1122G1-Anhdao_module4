package com.example.book_loan_app.service;

import com.example.book_loan_app.model.Book;
import com.example.book_loan_app.model.Oder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
    Book findById(int id);
    boolean findByCode(String code);
}
