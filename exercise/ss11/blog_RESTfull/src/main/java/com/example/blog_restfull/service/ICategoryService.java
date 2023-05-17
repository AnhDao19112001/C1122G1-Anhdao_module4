package com.example.blog_restfull.service;

import com.example.blog_restfull.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);
}
