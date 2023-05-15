package com.example.luyen_tap.model;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "clothing_id",referencedColumnName = "id")
    private ClothingStore clothingStore;

    public Category() {
    }

    public Category(int id, String name, ClothingStore clothingStore) {
        this.id = id;
        this.name = name;
        this.clothingStore = clothingStore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClothingStore getClothingStore() {
        return clothingStore;
    }

    public void setClothingStore(ClothingStore clothingStore) {
        this.clothingStore = clothingStore;
    }
}
