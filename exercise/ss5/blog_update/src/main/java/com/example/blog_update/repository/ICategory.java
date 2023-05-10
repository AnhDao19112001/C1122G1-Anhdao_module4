package com.example.blog_update.repository;

import com.example.blog_update.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategory extends JpaRepository<Category, Integer> {
    List<Category> findByNameCategory(String nameCategory);
    Category findById(int id);
}
