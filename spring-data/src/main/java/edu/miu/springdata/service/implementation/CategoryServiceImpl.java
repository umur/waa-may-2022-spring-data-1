package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.unidirectional.Category;
import edu.miu.springdata.repository.CategoryRepo;
import edu.miu.springdata.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    @Override
    public void save(Category p) {
        categoryRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category getById(int id) {
        return categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        List<Category> result = new ArrayList<>();
        categoryRepo.findAll().forEach(result::add);
        return result;
    }
}
