package com.example.springdata.service.impl;

import com.example.springdata.dto.AddProductDto;
import com.example.springdata.dto.ProductDto;
import com.example.springdata.entity.Category;
import com.example.springdata.entity.Product;
import com.example.springdata.repository.CategoryRepository;
import com.example.springdata.repository.ProductRepository;
import com.example.springdata.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public ProductDto save(AddProductDto productDto) throws ParseException {
        Product product = convertToEntity(productDto);
        Optional<Category> category = categoryRepository.findById(productDto.getCategoryId());
//        Optional<Category> category = categoryRepository.findById(1);
        if (category.isPresent()) {
            product.setCategory(category.get());
//            category.get().getProducts().add(product);
        }
        productRepository.save(product);
        return convertToDto(product);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public ProductDto getById(Integer id) {
        return productRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    public List<ProductDto> getAll() {
        return StreamSupport
                .stream(productRepository.findAll().spliterator(), false)
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getAllByMinPrice(Double price) {
        return productRepository.findAllByPriceGreaterThan(price).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<ProductDto> getAllByCategoryNameAndMaxPrice(String categoryName, double price) {
        var products = productRepository.findAllByCategoryNameAndPriceLessThan(categoryName, price).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return products;
    }

    private ProductDto convertToDto(Product product) {
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;
    }

    private Product convertToEntity(AddProductDto productDto) throws ParseException {
        ModelMapper mapper = new ModelMapper();
        Product product = mapper.map(productDto, Product.class);
        return product;
    }
}
