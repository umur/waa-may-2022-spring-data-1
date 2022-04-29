package com.springdata1.service;

import com.springdata1.domain.unidirectional.Product;
import com.springdata1.domain.unidirectional.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getALL();

    Review getById(int id);

    void save(Review review);

    void delete(int id);
}
