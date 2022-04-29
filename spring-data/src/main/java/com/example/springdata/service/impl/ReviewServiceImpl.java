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

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void delete(Integer id) {
        reviewRepository.deleteById(id);
    }

    public Review getById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public List<Review> getAll() {
        return StreamSupport
                .stream(reviewRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
