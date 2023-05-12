package com.example.book_loan_app.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String category;
    private String author;
    private Integer quantity;

    @OneToMany(mappedBy = "book")
    private Set<Oder> oderList;

    public Book() {
    }

    public Book(Integer id, String name, String category, String author, Integer quantity, Set<Oder> oderList) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
        this.oderList = oderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Oder> getOderList() {
        return oderList;
    }

    public void setOderList(Set<Oder> oderList) {
        this.oderList = oderList;
    }
}
