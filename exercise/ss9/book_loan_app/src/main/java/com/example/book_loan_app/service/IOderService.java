package com.example.book_loan_app.service;

import com.example.book_loan_app.model.Oder;

import java.util.List;

public interface IOderService {
    List<Oder> findAll();
    void save(Oder oder);
    Oder findByCode(String code);
    void delete(int id);

}
