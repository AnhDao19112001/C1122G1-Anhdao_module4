package com.example.luyen_tap.repository;

import com.example.luyen_tap.model.ClothingStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClothingStoreRepository extends JpaRepository<ClothingStore, Integer> {
}
