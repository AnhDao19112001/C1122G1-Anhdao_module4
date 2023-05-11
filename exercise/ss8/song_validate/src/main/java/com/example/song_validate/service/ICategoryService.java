package com.example.song_validate.service;

import com.example.song_validate.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    void create(Category category);
    void update(Category category);
}
