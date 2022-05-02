package com.example.demo.service;

import com.example.demo.entity.bidirectional.Review;
import com.example.demo.repo.ReviewRepo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepo reviewRepo;
    public void save(Review review){
        reviewRepo.save(review);
    }
    public Review getById(int id){
        var res= reviewRepo.findById(id);
        return res.orElse(null);
    }
    public List<Review> getAll(){
        var res= reviewRepo.findAll();
        List<Review> reviews= new ArrayList<>();
        res.forEach(reviews::add);
        return reviews;
    }

    public void delete(Review review){
        reviewRepo.delete(review);
    }

    public void update(int id, Review review){
        reviewRepo.deleteById(id);
        reviewRepo.save(review);
    }

    public  List<Review> getAllByProductId(int pid){
        return reviewRepo.findAllByProductId(pid);
    }

}
