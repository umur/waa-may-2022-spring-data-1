package com.example.aop.controller;

import com.example.lab2.Spring.Data.Service.ReviewService;
import com.example.lab2.Spring.Data.entity.Review;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    ReviewService reviewService;
    @GetMapping()
    public List<Review> getReviews() {
        return reviewService.getAll();
    }
    @PostMapping()
    public void createReview(@RequestBody Review review) {
        reviewService.create(review);
    }

    @PutMapping("/{id}")
    public void updateReview(@RequestBody Review review, @PathVariable("id") int id) {
        reviewService.update(review, id);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable("id") int id) {
        reviewService.delete(id);
    }

}
