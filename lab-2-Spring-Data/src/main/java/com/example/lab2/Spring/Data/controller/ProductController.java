package com.example.aop.controller;

import com.example.lab2.Spring.Data.Service.ProductService;
import com.example.lab2.Spring.Data.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping(value = "/filter")
    public List<Product> filterByPrice(@RequestParam(defaultValue = "0.0", name = "minPrice") float minPrice,
                                       @RequestParam(defaultValue = "0.0", name = "maxPrice") float maxPrice,
                                       @RequestParam(defaultValue = "", name="name") String name) {
        return productService.filterByPrice(minPrice, maxPrice, name);
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> getProductsById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @PostMapping()
    public void create(@RequestBody Product product) {
        productService.create(product);
    }

    @PutMapping(value="/{id}")
    public void update(@RequestBody Product product, @PathVariable int id) {
        productService.update(product, id);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }
}
