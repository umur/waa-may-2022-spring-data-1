package com.example.demo.controller;

import com.example.demo.entity.bidirect.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private ProductService productService;

    @GetMapping("/{id}/products/")
    public List<Product> findProductswithPrice(@PathVariable int id, @RequestParam(defaultValue = "0",name = "maxprice") double maxprice){
      return   productService.findAllByCategoryIdAndPriceLessThan(id,maxprice);
    }
}
