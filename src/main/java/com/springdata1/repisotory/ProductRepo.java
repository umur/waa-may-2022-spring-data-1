package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findByPriceGreaterThan(float minPrice);

}
