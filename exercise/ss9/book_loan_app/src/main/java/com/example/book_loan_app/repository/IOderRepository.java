package com.example.book_loan_app.repository;

import com.example.book_loan_app.model.Oder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IOderRepository extends JpaRepository<Oder, Integer> {
    Oder findByCode(String code);
}
