package edu.miu.springdata.service.implementation;

import edu.miu.springdata.DTO.ProductDto;
import edu.miu.springdata.DTO.ReviewDto;
import edu.miu.springdata.entity.bidirectional.Product;
import edu.miu.springdata.entity.bidirectional.Review;
import edu.miu.springdata.repository.ProductRepo;
import edu.miu.springdata.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
    public void save(ProductDto p) {

        Product product = modelMapper.map(p, Product.class);
        productRepo.save(product);
    }

    @Override
    public void deleteById(int id) {
            productRepo.deleteById(id);
    }

    @Override
    public ProductDto getById(int id) {
        return modelMapper.map(productRepo.findById(id).get(),ProductDto.class);
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductDto> result = new ArrayList<>();
        productRepo.findAll().forEach(
                p -> result.add(modelMapper.map(p, ProductDto.class))
        );
        return result;
    }

    public List<ProductDto> findByPriceGreaterThan(float price){
        List<ProductDto> result = new ArrayList<>();
        productRepo.findByPriceGreaterThan(price).forEach(
                p -> result.add(modelMapper.map(p, ProductDto.class))
        );
        return result;
    }
    public List<ProductDto> findByCategoryAndPriceLessThan(String Category, float price){
        List<ProductDto> result = new ArrayList<>();
        productRepo.findByCategoryAndPriceLessThan(Category, price).forEach(
                p -> result.add(modelMapper.map(p, ProductDto.class))
        );
        return result;
    }
    public List<ProductDto> findByNameContaining(String name){
        List<ProductDto> result = new ArrayList<>();
        productRepo.findByNameContaining(name).forEach(
                p -> result.add(modelMapper.map(p, ProductDto.class))
        );
        return result;
    }
    public List<ReviewDto> getReviewByProductId(int id) {
        List<ReviewDto> result = new ArrayList<>();
        productRepo
                .findById(id)
                .stream().forEach(
                        p -> result.add(modelMapper.map(p.getReviews(), ReviewDto.class))
                );
        return result;
    }

}
