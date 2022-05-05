package com.example.lab2.service;


import com.example.lab2.domain.unidirectional.Product_Ud;
import com.example.lab2.repository.Product_Ud_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Product_Ud_Service {

    private Product_Ud_Repository repository;

    public Product_Ud createOrUpdate(Product_Ud product){

        return repository.save(product);
    }
    public Product_Ud update(Product_Ud product, int productId){
        return  repository.save(product);
    }
    public List<Product_Ud> findAll(){
        return  repository.findAll();
    }
    public List<Product_Ud> findByPriceGreaterThan(float price){
        return  repository.findByPriceGreaterThan(price);
    }
    public Optional<Product_Ud> findById(Integer id){
        return repository.findById(id);
    }

    public void  delete(Integer productId){
        repository.deleteById(productId);
    }

    public Product_Ud getProductById(Integer id){
        return repository.findById(id).orElse(null);
    }



}
