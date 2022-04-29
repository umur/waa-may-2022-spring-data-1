package com.shop.association.controller;

import com.shop.association.domain.Product;
import com.shop.association.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }
    @PutMapping("/{id}")
    public void update(@RequestBody Product product,@PathVariable int id) {
        productService.update(product, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productService.getById(id);
    }

}
