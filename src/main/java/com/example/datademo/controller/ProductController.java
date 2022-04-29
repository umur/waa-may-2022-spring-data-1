package com.example.datademo.controller;

import com.example.datademo.entity.Product;
import com.example.datademo.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("api/v1/products")
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Product p){
        productService.save(p);
        return ResponseEntity.ok("Success");
    }
    @GetMapping
    public ResponseEntity<Iterable<Product>> getAll(@RequestParam Optional<Double> minPrice){
        if (minPrice.isPresent()) {
            Iterable<Product> list = productService.findProduct(minPrice.get());
            return ResponseEntity.ok(list);

        }else{
            Iterable<Product> list = productService.getAll();
            return ResponseEntity.ok(list);
        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getByID(@PathVariable int id){
        Product p = productService.getById(id);
        return ResponseEntity.ok(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody Product p ,@PathVariable int id){
        productService.update(p,id);
        return ResponseEntity.ok("Success");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        productService.delete(id);
        return ResponseEntity.ok("Success");
    }

}
