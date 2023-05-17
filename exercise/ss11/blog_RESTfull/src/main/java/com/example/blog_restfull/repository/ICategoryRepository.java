package com.example.blog_restfull.repository;

import com.example.blog_restfull.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByNameCategory(String nameCategory);
    Category findById(int id);
}
