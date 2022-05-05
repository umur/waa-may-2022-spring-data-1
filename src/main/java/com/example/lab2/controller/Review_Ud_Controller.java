package com.example.lab2.controller;

import com.example.lab2.domain.ReviewDTO;
import com.example.lab2.domain.UserDTO;
import com.example.lab2.domain.unidirectional.Review_Ud;
import com.example.lab2.domain.unidirectional.User_Ud;
import com.example.lab2.service.Review_Ud_Service;
import com.example.lab2.service.User_Ud_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class Review_Ud_Controller {

    @Autowired
    private Review_Ud_Service service;

    //Creating
    @PostMapping("/reviews")
    public Review_Ud addReview(@RequestBody ReviewDTO reviewDTO){

        Review_Ud review = new Review_Ud();
        review.setComment(reviewDTO.getComment());
        return service.createOrUpdate(review);

    }
    //Reading
    @GetMapping("/reviews")
    public List<Review_Ud> findAll(){
        return service.findAll();
    }

    //Update
    @PutMapping("/review/{reviewId}")
    public Review_Ud updateReview(@RequestBody ReviewDTO reviewDTO, @PathVariable int reviewId){
        Review_Ud reviewExisting = service.getAReviewById(reviewId);

        Review_Ud review = new Review_Ud();
        review.setComment(reviewDTO.getComment());
        return service.createOrUpdate(review);

    }
    //Delete
    @DeleteMapping("/review/{reviewId}")
    public void delete(@PathVariable int reviewId){
        service.delete(reviewId);
    }



}
