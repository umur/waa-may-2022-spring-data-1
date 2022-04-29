package edu.miu.springdata.controller;

import edu.miu.springdata.DTO.ProductDto;
import edu.miu.springdata.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void save(@RequestBody ProductDto p) {
        productService.save(p);
    }
    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<ProductDto> getById(@PathVariable int id) {
//        return ResponseEntity.ok(productService.getById(id));
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.deleteById(id);
    }

    @GetMapping("/{minPrice}")
    public List<ProductDto> findByPriceGreaterThan(@PathVariable float minPrice) {
        return productService.findByPriceGreaterThan(minPrice);
    }

    @GetMapping("/{category}/{price}")
    public List<ProductDto> findByCategoryAndPriceLessThan(@PathVariable String category, @PathVariable float price){

        return productService.findByCategoryAndPriceLessThan(category, price);
    }
    @GetMapping("/{name}")
    public List<ProductDto> findByNameContaining(@PathVariable String name){
        return productService.findByNameContaining(name);
    }



}
