package com.example.datademo.service.impl;

import com.example.datademo.dto.ProductDto;
import com.example.datademo.entity.Product;
import com.example.datademo.repository.ProductRepository;
import com.example.datademo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        Optional<Product> result = productRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            return null;
        }
    }

    @Override
    public void update(Product p, int id) {
        Product product = productRepository.findById(id).get();
        product.setName(p.getName());
        product.setCategory(p.getCategory());
        product.setId(p.getId());
        product.setPrice(p.getPrice());
        product.setRating(p.getRating());
        productRepository.save(product);
    }

    @Override
    public void delete(int id) {
        Product product = productRepository.findById(id).get();
        productRepository.delete(product);
    }

    @Override
    public void save(Product p) {
        productRepository.save(p);
    }

    @Override
    public List<Product> findProduct(Double price){
        return productRepository.findProductByPriceGreaterThan(price);
    }
    @Override
    public List<Product> findProduct2(Double price){
        return productRepository.findProduct(price);
    }
}
