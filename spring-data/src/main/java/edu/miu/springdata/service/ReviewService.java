package edu.miu.springdata.service;

import edu.miu.springdata.DTO.ReviewDto;
import edu.miu.springdata.entity.unidirectional.Review;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto p);
    void deleteById(int id);
    ReviewDto getById(int id);
    List<ReviewDto> getAll();
}
