package com.example.lab2.repository;


import com.example.lab2.domain.unidirectional.Product_Ud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_Ud_Repository extends JpaRepository<Product_Ud, Integer> {
    List<Product_Ud> findAll();
    List<Product_Ud> findByPriceGreaterThan(float price);
}
