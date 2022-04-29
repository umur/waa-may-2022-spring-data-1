package com.example.lab2.controller;

import com.example.lab2.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {

    private final ProductService productService;

    public ReviewController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getReviewByProductId(@PathVariable long id) {
        return new ResponseEntity<>(productService.getReviewByProductId(id), HttpStatus.OK);
    }
}
