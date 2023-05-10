package com.example.blog_update.service;

import com.example.blog_update.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    void delete(int id);

    void update(Category category);

    Category findById(int id);
}
