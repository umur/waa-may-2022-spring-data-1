package com.example.lab2.service;


import com.example.lab2.domain.unidirectional.Address_Ud;
import com.example.lab2.domain.unidirectional.Review_Ud;
import com.example.lab2.repository.Address_Ud_Repository;
import com.example.lab2.repository.Review_Ud_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Review_Ud_Service {

    private Review_Ud_Repository repository;



    public Review_Ud createOrUpdate(Review_Ud review){

        return repository.save(review);
    }
    public Review_Ud update(Review_Ud review, int reviewId){
        return  repository.save(review);
    }
    public List<Review_Ud> findAll(){
        return  repository.findAll();
    }

    public Optional<Review_Ud> findById(Integer id){
        return repository.findById(id);
    }

    public void  delete(Integer reviewId){
        repository.deleteById(reviewId);
    }

    public Review_Ud getAReviewById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
