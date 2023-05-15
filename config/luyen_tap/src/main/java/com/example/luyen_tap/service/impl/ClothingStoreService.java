package com.example.luyen_tap.service.impl;

import com.example.luyen_tap.model.ClothingStore;
import com.example.luyen_tap.repository.IClothingStoreRepository;
import com.example.luyen_tap.service.IClothingStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClothingStoreService implements IClothingStoreService {
    @Autowired
    private IClothingStoreRepository iClothingStoreRepository;
    @Override
    public List<ClothingStore> findAll() {
        return iClothingStoreRepository.findAll();
    }
}
