package com.webshop.mapping.service;

import com.webshop.mapping.domain.Product;
import com.webshop.mapping.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();

    ProductDto findById(Long id);

    ProductDto save(ProductDto product);

    void remove(Long id);

    List<ProductDto> findAllByPriceGreaterThan(int minPrice);

    List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, int maxPrice);

    List<ProductDto> findAllByNameContains(String keyword);

}
