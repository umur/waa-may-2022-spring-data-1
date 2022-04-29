package com.example.lab2.repository;

import com.example.lab2.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByCategoryAndPriceLessThan(String category, double price);
    List<Product> findByCategoryContaining(String keyword);
}
