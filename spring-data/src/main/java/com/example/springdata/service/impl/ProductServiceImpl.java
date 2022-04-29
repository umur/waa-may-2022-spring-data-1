package com.example.springdata.service.impl;

import com.example.springdata.entity.Product;
import com.example.springdata.repository.ProductRepository;
import com.example.springdata.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAll() {
        return StreamSupport
                .stream(productRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
