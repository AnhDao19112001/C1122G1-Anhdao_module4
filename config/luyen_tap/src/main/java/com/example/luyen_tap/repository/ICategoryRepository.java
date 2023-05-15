package com.example.luyen_tap.repository;

import com.example.luyen_tap.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
