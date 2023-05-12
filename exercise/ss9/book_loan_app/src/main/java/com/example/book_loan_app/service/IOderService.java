package com.example.book_loan_app.service;

import com.example.book_loan_app.model.Oder;

import java.util.List;

public interface IOderService {
    List<Oder> findAll();

    String setCode();


}
