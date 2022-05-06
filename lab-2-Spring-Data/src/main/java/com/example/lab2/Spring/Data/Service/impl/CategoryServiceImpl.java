package com.example.lab2.Spring.Data.Service.impl;

import com.example.lab2.Spring.Data.Service.CategoryService;
import com.example.lab2.Spring.Data.entity.Category;
import com.example.lab2.Spring.Data.repository.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public List<Category> getCategories() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public void updateCategory(Category category, int id) {
        category.setId(id);
        categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepo.deleteById(id);
    }
}
