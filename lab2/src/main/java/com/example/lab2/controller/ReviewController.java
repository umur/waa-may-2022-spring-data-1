package com.example.lab2.controller;

import com.example.lab2.dto.ReviewDTO;
import com.example.lab2.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public List<ReviewDTO> getAll(){
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ReviewDTO getById(@PathVariable int id){
        return reviewService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody ReviewDTO reviewDTO){
        reviewService.save(reviewDTO);
    }

    @DeleteMapping
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ReviewDTO reviewDTO){
        reviewService.update(id, reviewDTO);
    }
}
