package com.example.springdata.service;

import com.example.springdata.entity.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);

    public void delete(Integer id);

    public Product getById(Integer id);

    public List<Product> getAll();
}
