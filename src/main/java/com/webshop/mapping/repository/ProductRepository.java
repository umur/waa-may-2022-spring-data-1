package com.webshop.mapping.repository;

import com.webshop.mapping.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {

    List<Product> findAllByPriceGreaterThan(int minPrice);

    List<Product> findByCategoryNameAndPriceLessThan(String categoryName, int maxPrice);

    List<Product> findAllByNameContains(String keyword);

}
