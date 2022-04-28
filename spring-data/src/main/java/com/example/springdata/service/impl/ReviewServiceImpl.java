package com.example.springdata.service.impl;

import com.example.springdata.entity.Review;
import com.example.springdata.repository.ReviewRepository;
import com.example.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private ReviewRepository reviewRepository;

    @Override
    public void save(Review review) {
        reviewRepository.save(review);
    }

    @Override
    public void delete(Integer id) {
        reviewRepository.deleteById(id);
    }

    @Override
    public Review getById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public List<Review> getAll() {
        return StreamSupport
                .stream(reviewRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
