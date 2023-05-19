package com.example.blog_restfull.service.impl;
import com.example.blog_restfull.model.Blog;
import com.example.blog_restfull.repository.IBlogRepository;
import com.example.blog_restfull.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public List<Blog> showListByCategory(int id) {
        return iBlogRepository.showListByCategory(id);
    }

    @Override
    public Page<Blog> searchByTitle(String title, Pageable pageable) {
        return iBlogRepository.findAllByTitleContaining(title, pageable);
    }

}
