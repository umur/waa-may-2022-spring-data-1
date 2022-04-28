package edu.miu.springdata.service.implementation;

import edu.miu.springdata.DTO.ProductDto;
import edu.miu.springdata.entity.unidirectional.Product;
import edu.miu.springdata.repository.ProductRepo;
import edu.miu.springdata.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

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
}
