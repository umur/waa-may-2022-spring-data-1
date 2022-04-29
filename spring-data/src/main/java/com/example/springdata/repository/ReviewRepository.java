package com.example.springdata.repository;

import com.example.springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    List<Review> findByProductIdAndUserId(@Param("product_id") int productId, @Param("user_id") int userId);
}