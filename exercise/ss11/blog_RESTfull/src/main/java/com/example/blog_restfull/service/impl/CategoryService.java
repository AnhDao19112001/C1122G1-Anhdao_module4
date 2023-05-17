package com.example.blog_restfull.service.impl;

import com.example.blog_restfull.model.Category;
import com.example.blog_restfull.repository.ICategoryRepository;
import com.example.blog_restfull.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }
    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id);
    }
}
