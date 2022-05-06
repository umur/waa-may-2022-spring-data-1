package com.example.lab2.Spring.Data.Service;

import com.example.lab2.Spring.Data.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAll();

    void create(Review review);

    void update(Review review, int id);

    void delete(int id);
}
