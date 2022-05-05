package com.example.lab2.controller;


import com.example.lab2.domain.ProductDTO;
import com.example.lab2.domain.unidirectional.Product_Ud;
import com.example.lab2.service.Product_Ud_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Product_Ud_Controller {
    @Autowired
    private Product_Ud_Service service;

    //Creating
    @PostMapping("/products")
    public Product_Ud addProduct(@RequestBody ProductDTO productDTO){

        Product_Ud product = new Product_Ud();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setRating(productDTO.getRating());
        return service.createOrUpdate(product);

    }
    //Reading
    @GetMapping("/products")
    public List<Product_Ud> findAll(){
        return service.findAll();
    }

    //Update
    @PutMapping("/product/{productId}")
    public Product_Ud updateProduct(@RequestBody ProductDTO productDTO,@PathVariable int productId){
        System.out.println(productId);
        Product_Ud productExisting = service.getProductById(productId);
        if(productExisting == null){

        }

        Product_Ud product = new Product_Ud();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setRating(productDTO.getRating());
        return service.update(product,productId);

    }
    //Delete
    @DeleteMapping("/product/{productId}")
    public void delete(@PathVariable int productId){
        System.out.println(productId);
        service.delete(productId);
    }

    @GetMapping("price/{minPrice}")
    public List<Product_Ud> findByPriceGreaterThan(@PathVariable float minPrice){
        return service.findByPriceGreaterThan(minPrice);
    }



}
