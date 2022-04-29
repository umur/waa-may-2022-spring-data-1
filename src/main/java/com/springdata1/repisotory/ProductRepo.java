package com.springdata1.repisotory;

import com.springdata1.domain.bidirectional.Productbidir;

import com.springdata1.domain.unidirectional.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findByPriceGreaterThan(float minPrice);
    List<Product> findByNameContaining(String name);




}
