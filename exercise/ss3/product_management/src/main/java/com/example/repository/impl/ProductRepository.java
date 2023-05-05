package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Xe máy", 135000.0, "new", "Anh Đào"));
        productList.put(2, new Product(2, "Xe đạp", 135000.0, "new", "Anh Đào"));
        productList.put(3, new Product(3, "Xe thồ", 135000.0, "new", "Anh Đào"));
        productList.put(4, new Product(4, "Xe oto", 135000.0, "new", "Anh Đào"));
        productList.put(5, new Product(5, "Xe ba gác", 135000.0, "new", "Anh Đào"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }

    @Override
    public void edit(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product item : productList.values()) {
            if (item.getName().contains(name)) {
                products.add(item);
            }
        }
        return products;
    }
}
