package com.example.lab2.service;

import com.example.lab2.dto.ProductDTO;

public interface ProductService {
    void save(ProductDTO productDTO);
    void delete(int id);
    void update(int id, ProductDTO productDTO);
    ProductDTO getById(int id);
}
