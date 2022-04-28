package com.example.lab2.controller;


import com.example.lab2.dtos.ProductDTO;
import com.example.lab2.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){this.productService = productService;}

    @GetMapping
    public ResponseEntity<?> getProducts(@RequestParam Map<String, String> params){
        if(params.containsKey("minprice"))
            return new ResponseEntity<>(
                    productService
                            .getProductsByPriceLessThan(Double.parseDouble(params.get("minprice"))),
                    HttpStatus.OK);
        if(params.containsKey("cat") && params.containsKey("maxprice"))
            return new ResponseEntity<>(
                             productService
                            .getProductsByCategoryAndPriceGreaterThan(
                                    params.get("cat"),
                                    Double.parseDouble(params.get("maxprice"))),
                    HttpStatus.OK);
        if(params.containsKey("name"))
            return new ResponseEntity<>(
                       productService
                               .getProductByNameContaining(params.get("name")),
                       HttpStatus.OK);
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable long id){
        Optional<ProductDTO> optionalProduct = Optional.ofNullable(productService.getProduct(id));
        return optionalProduct.isPresent() ?
                new ResponseEntity<>(optionalProduct.get(), HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO productDTO){
        Optional<ProductDTO> optionalProduct = Optional.ofNullable(productService.createProduct(productDTO));
        return new ResponseEntity<>(optionalProduct.get(), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productDTO, @PathVariable long id){
        productService.updateProduct(productDTO,id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
