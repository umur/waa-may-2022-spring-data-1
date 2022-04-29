package com.springdata1.service;

import com.springdata1.domain.unidirectional.Category;
import com.springdata1.domain.unidirectional.Product;

import java.util.List;

public interface ProductService {
    List<Product> getALL();

    Product getById(int id);

    void save(Product prod);

    void delete(int id);
    List<Product> findByPriceGreaterThan(int price);
    List<Product> findByNameContaining(String name);
}
