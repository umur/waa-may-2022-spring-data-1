package com.pprajapati.springdata1.service.impl;

import com.pprajapati.springdata1.domain.Category;
import com.pprajapati.springdata1.domain.User;
import com.pprajapati.springdata1.repo.CategoryRepo;
import com.pprajapati.springdata1.repo.UserRepo;
import com.pprajapati.springdata1.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    @Override
    public void save(Category p) {
        categoryRepo.save(p);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category getById(int id) {
        return (Category) categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return StreamSupport.stream(categoryRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
