package com.example.datademo.service;

import com.example.datademo.entity.Review;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {
    public Iterable<Review> getAll();

    public Review getById(int id);

    public void update(Review r, int id);

    public void delete(int id);

    public void save(Review r);
}
