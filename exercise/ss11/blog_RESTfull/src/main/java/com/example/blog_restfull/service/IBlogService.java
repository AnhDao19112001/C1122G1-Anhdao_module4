package com.example.blog_restfull.service;
import com.example.blog_restfull.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    Optional<Blog> findById(int id);

    List<Blog> showListByCategory(int id);

    Page<Blog> searchByTitle(String title, Pageable pageable);
}
