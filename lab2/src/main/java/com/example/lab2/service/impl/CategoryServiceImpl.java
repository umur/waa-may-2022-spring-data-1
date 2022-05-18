package com.example.lab2.service.impl;

import com.example.lab2.dto.CategoryDTO;
import com.example.lab2.service.CategoryService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public void save(CategoryDTO categoryDTO) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, CategoryDTO categoryDTO) {

    }

    @Override
    public CategoryDTO getById(int id) {
        return null;
    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
    }
}
