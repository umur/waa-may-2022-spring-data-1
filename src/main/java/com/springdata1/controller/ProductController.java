package com.springdata1.controller;

import com.springdata1.domain.unidirectional.Product;
import com.springdata1.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/V1/Products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping()
    public List<Product> getAll() {
        return productServiceImpl.getALL();
    }

    @GetMapping("/{price}")
    public List<Product> findByPriceGreaterThan(@PathVariable int price) {
        return productServiceImpl.findByPriceGreaterThan(price);
    }
    @GetMapping("/{name}")
    public List<Product> findByNameContaining(@PathVariable String  name) {
        return productServiceImpl.findByNameContaining(name);
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id) {
        return productServiceImpl.getById(id);
    }
    @PostMapping()
    public void save(@RequestBody Product product) {
        productServiceImpl.save(product);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productServiceImpl.delete(id);
    }

}
