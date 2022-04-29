package com.pprajapati.springdata1.repo;


import com.pprajapati.springdata1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    
    public List<Product> findByNameContaining(String name);
}