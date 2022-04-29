package com.example.springdata.controller;

import com.example.springdata.dto.ReviewDto;
import com.example.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/reviews")
@AllArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public ResponseEntity<List<ReviewDto>> getAllByProductIdAndUserId(@RequestParam Map<String, String> params) {
        if (params.containsKey("productId") && params.containsKey("userId")) {
            int productId = Integer.parseInt(params.get("productId"));
            int userId = Integer.parseInt(params.get("userId"));
            return ResponseEntity.ok(reviewService.getAllByProductIdAndUserId(productId, userId));
        }

        return ResponseEntity.badRequest().body(new ArrayList<>());
    }
}
