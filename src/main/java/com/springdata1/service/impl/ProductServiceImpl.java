package com.springdata1.service.impl;

import com.springdata1.domain.unidirectional.Product;
import com.springdata1.repisotory.ProductRepo;
import com.springdata1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getALL() {

       return (List<Product>) productRepo.findAll();
    }

    @Override
    public List<Product> findByPriceGreaterThan(int price) {
        return productRepo.findByPriceGreaterThan(price);
    }
    @Override
    public Product getById(int id) {
        return productRepo.findById(id).stream().collect(Collectors.toList()).get(0);
    }
    @Override
    public  List<Product> findByNameContaining(String name) {
        return productRepo.findByNameContaining(name).stream().collect(Collectors.toList());
    }


    @Override
    public void save(Product prod) {

    }

    @Override
    public void delete(int id) {
productRepo.deleteById(id);
    }
}
