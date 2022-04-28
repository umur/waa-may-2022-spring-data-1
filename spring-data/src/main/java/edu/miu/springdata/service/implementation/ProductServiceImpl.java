package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.unidirectional.Product;
import edu.miu.springdata.repository.ProductRepo;
import edu.miu.springdata.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;

    @Override
    public void save(Product p) {
        productRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
            productRepo.deleteById(id);
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        List<Product> result = new ArrayList<>();
        productRepo.findAll().forEach(result::add);
        return result;
    }
}
