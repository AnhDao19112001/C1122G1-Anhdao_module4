package com.example.song_validate.service.impl;

import com.example.song_validate.model.Category;
import com.example.song_validate.repository.ICategoryRepository;
import com.example.song_validate.service.ICategoryService;
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
    public void create(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void update(Category category) {
        iCategoryRepository.save(category);
    }
}
