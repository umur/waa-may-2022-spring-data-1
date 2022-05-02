package com.example.demo.repository;

import com.example.demo.entity.bidirect.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
    List<Review> findAllByProductId(int productId);
}
