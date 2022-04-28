package com.example.lab2.service;

import com.example.lab2.domain.Category;
import com.example.lab2.domain.Product;
import com.example.lab2.dtos.ProductDTO;
import com.example.lab2.repository.CategoryRepository;
import com.example.lab2.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public ProductService(ProductRepository productRepository,
                          ModelMapper modelMapper,
                          CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
        this.categoryRepository = categoryRepository;
    }

    public Collection<ProductDTO> getProducts() {
        return productRepository
                .findAll()
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    public ProductDTO getProduct(long id) {
        return productRepository
                .findById(id)
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .orElse(null);
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Optional<Category> optionalCategory = getCategoryForProduct(productDTO.getCategory());
        Product product = mapTOProduct(productDTO);
        if(optionalCategory.isPresent())
            product.setCategory(optionalCategory.get());
        else{
            Category category = new Category();
            category.setName(productDTO.getCategory());
            product.setCategory(category);
            categoryRepository.save(category);
        }
        productRepository.save(product);
        return productDTO;
    }

    private Optional<Category> getCategoryForProduct(String name){
        return Optional.ofNullable(categoryRepository.findByName(name));
    }

    private Product mapTOProduct(ProductDTO productDTO){
        return modelMapper.map(productDTO,Product.class);
    }

    public void updateProduct(ProductDTO productDTO, long id) {
        productRepository.deleteById(id);
        Optional<Category> optionalCategory = getCategoryForProduct(productDTO.getCategory());
        Product product = mapTOProduct(productDTO);
        if(optionalCategory.isPresent())
            product.setCategory(optionalCategory.get());
        else{
            Category category = new Category();
            category.setName(productDTO.getCategory());
            product.setCategory(category);
            categoryRepository.save(category);
        }
        productRepository.save(product);
    }

    public Collection<ProductDTO> getProductsByPriceLessThan(double price) {
        return productRepository
                .findByPriceGreaterThan(price)
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    public Collection<ProductDTO> getProductsByCategoryAndPriceGreaterThan(String cat, double maxprice) {
        return productRepository
                .findByCategoryAndPriceLessThan(cat, maxprice)
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    public Collection<ProductDTO> getProductByNameContaining(String name) {
        return productRepository
                .findByCategoryContaining(name)
                .stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }
}
