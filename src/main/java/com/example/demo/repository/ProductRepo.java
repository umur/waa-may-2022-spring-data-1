package com.example.demo.repository;

import com.example.demo.controller.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    public List<Product> findAllByPriceGreaterThan(double price);
}
