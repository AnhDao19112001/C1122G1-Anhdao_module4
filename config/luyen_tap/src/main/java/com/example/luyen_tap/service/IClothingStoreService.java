package com.example.luyen_tap.service;

import com.example.luyen_tap.model.ClothingStore;
import com.example.luyen_tap.service.impl.ClothingStoreService;

import java.util.List;

public interface IClothingStoreService {
    List<ClothingStore> findAll();
}
