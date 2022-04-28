package edu.miu.springdata.service;

import edu.miu.springdata.DTO.ProductDto;
import edu.miu.springdata.entity.unidirectional.Product;

import java.util.List;

public interface ProductService {

    void save(ProductDto p);
    void deleteById(int id);
    ProductDto getById(int id);
    List<ProductDto> getAll();
}
