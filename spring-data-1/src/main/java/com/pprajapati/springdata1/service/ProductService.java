package com.pprajapati.springdata1.service;

import com.pprajapati.springdata1.domain.*;

import java.util.List;

public interface ProductService {
    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();

    List<Product> getWithMinPrice();
    List<Review> getReviewsFromProductId(int productId);
}
