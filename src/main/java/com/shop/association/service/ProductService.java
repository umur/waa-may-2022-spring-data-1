package com.shop.association.service;

import com.shop.association.domain.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);

    void update(Product product, int id);

    void delete(int id);

    List<Product> getAll();

    Product getById(int id);
}
