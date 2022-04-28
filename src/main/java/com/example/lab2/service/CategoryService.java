package com.example.lab2.service;

import com.example.lab2.domain.Category;
import com.example.lab2.dtos.CategoryDTO;
import com.example.lab2.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository,
                           ModelMapper modelMapper){
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }
    public CategoryDTO createCategory(Category category) {
        return modelMapper
                .map(categoryRepository.save(category), CategoryDTO.class);

    }
}
