package com.example.blog_update.service.impl;

import com.example.blog_update.model.Category;
import com.example.blog_update.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryService iCategoryService;
    @Override
    public List<Category> findAll() {
        return iCategoryService.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryService.save(category);
    }

    @Override
    public void delete(int id) {
        iCategoryService.delete(id);
    }

    @Override
    public void update(Category category) {
        iCategoryService.save(category);
    }

    @Override
    public Category findById(int id) {
        return iCategoryService.findById(id);
    }

}
