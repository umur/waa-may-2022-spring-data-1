package com.example.datademo.repository;

import com.example.datademo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    public List<Product> findProductByPriceGreaterThan(Double price);

    @Query(value="SELECT * FROM Product p WHERE p.price > ?1",nativeQuery = true)
    public List<Product> findProduct(Double price);
}
