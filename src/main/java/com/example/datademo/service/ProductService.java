package com.example.datademo.service;

import com.example.datademo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    public Iterable<Product> getAll();

    public Product getById(int id);

    public void update(Product p, int id);

    public void delete(int id);

    public void save(Product p);

    public List<Product> findProduct(Double price);
    public List<Product> findProduct2(Double price);
}
