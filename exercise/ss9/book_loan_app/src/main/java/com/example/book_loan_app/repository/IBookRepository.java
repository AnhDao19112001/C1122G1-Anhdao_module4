package com.example.book_loan_app.repository;

import com.example.book_loan_app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {

    Book findById(int id);

}
