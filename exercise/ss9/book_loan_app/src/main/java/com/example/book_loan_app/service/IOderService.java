package com.example.book_loan_app.service;

import com.example.book_loan_app.model.Oder;

import java.util.List;

public interface IOderService {
    List<Oder> findAll();
    void save(Oder oder);
    String findByCode();
    void delete(int id);

    void returnBook(String code);
}
