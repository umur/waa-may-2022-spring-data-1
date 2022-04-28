package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.Product;

import java.util.List;

public interface ProductService {

    void save(Product p);
    void delete(int id);
    void update(Product p);
    Product getById(int id);
    List<Product> getAll();
}
