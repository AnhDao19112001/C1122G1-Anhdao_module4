package com.example.luyen_tap.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class ClothingStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String origin;

    @OneToMany(mappedBy = "clothingStore")
    Set<Category> categorySet;

    public ClothingStore() {
    }

    public ClothingStore(int id, String name, int quantity, double price, String origin, Set<Category> categorySet) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.origin = origin;
        this.categorySet = categorySet;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
    }
}
