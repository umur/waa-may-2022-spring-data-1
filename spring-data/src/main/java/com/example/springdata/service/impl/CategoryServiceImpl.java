package com.example.springdata.service.impl;

import com.example.springdata.entity.Category;
import com.example.springdata.repository.CategoryRepository;
import com.example.springdata.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    public Category getById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getAll() {
        return StreamSupport
                .stream(categoryRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
