package com.example.demo.service;

import com.example.demo.controller.Product;
import com.example.demo.repository.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;
    public List<Product> findAllByPriceGreaterThan(double price){
        return productRepo.findAllByPriceGreaterThan(price);
    }

}
