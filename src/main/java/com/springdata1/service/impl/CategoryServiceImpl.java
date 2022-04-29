package com.springdata1.service.impl;

import com.springdata1.domain.unidirectional.Category;
import com.springdata1.repisotory.CategoryRepo;
import com.springdata1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<Category> getALL() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public Category getById(int id) {
        return  categoryRepo.findById(id).stream().collect(Collectors.toList()).get(0);
    }

    @Override
    public void save(Category cat) {
        categoryRepo.save(cat);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

}
