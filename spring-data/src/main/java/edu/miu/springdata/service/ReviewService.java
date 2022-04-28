package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.Review;

import java.util.List;

public interface ReviewService {
    void save(Review p);
    void deleteById(int id);
    Review getById(int id);
    List<Review> getAll();
}
