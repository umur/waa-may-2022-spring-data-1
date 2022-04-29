package com.springdata1.service.impl;

import com.springdata1.domain.unidirectional.Review;
import com.springdata1.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<Review> getALL() {
        return null;
    }

    @Override
    public Review getById(int id) {
        return null;
    }

    @Override
    public void save(Review review) {

    }

    @Override
    public void delete(int id) {

    }
}
