package com.example.blog_update.service;

import com.example.blog_update.blogDto.BlogDto;
import com.example.blog_update.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    void update(Blog blog);

    Blog findById(int id);
Page<Blog> findAll(Pageable pageable);
    Page<Blog> findByTitle(String title, Pageable pageable);
    List<BlogDto> showListDto();
}
