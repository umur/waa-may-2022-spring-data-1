package com.pprajapati.springdata1.controller;

import com.pprajapati.springdata1.domain.Product;
import com.pprajapati.springdata1.domain.Review;
import com.pprajapati.springdata1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody Product p) {
        productService.save(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable int id) {
        var product = productService.getById(id);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping("/getreviewsbyproduct/{id}")
    public List<Review> getReviewsByProductId(@PathVariable int id) {
        return productService.getReviewsFromProductId(id);

    }

    @GetMapping("/getByName/{name}")
    public List<Product> getByName(@PathVariable String name) {
        System.out.println(name);
        return productService.getByName(name);

    }

}
