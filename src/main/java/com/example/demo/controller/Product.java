package com.example.demo.controller;

import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class Product {
    private final ProductService productService;
  //  @PostMapping
//    public List<Product> findAllProductsPriceGreaterThan(@RequestBody double price)
//    {
//        return productService.findAllByPriceGreaterThan(price);
//    }
}
