package com.example.lab2.controller;

import com.example.lab2.dto.ProductDTO;
import com.example.lab2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductDTO> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable int id){
        return productService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody ProductDTO productDTO){
        productService.save(productDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody ProductDTO productDTO){
        productService.update(id, productDTO);
    }

    @GetMapping("/find-all-by-name")
    public List<ProductDTO> findAllByNameEquals(@RequestParam String name){
        return productService.findAllByNameEquals(name);
    }

    @GetMapping("/find-all-by-price")
    public List<ProductDTO> findAllByPriceGreaterThan(@RequestParam double price){
        return productService.findAllByPriceGreaterThan(price);
    }

    @GetMapping("/find-all-by-category-and-price")
    public List<ProductDTO> findAllByCategoryAndPriceIsLessThan(@RequestParam String category, @RequestParam double price){
        return productService.findAllByCategoryAndPriceIsLessThan(category, price);
    }
}
