package com.example.springdata.service;

import com.example.springdata.entity.Category;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface CategoryService {
    public Category save(Category category);

    public void delete(Integer id);

    public Category getById(Integer id);

    public List<Category> getAll();
}
