package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findByTitle(String title);
}
