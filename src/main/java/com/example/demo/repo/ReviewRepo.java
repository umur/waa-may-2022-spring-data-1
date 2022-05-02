package com.example.demo.repo;

import com.example.demo.entity.bidirectional.Product;
import com.example.demo.entity.bidirectional.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
    List<Review> findAllByProductId(int id);
}
