package com.springdata1.controller;

import com.springdata1.domain.unidirectional.Category;
import com.springdata1.domain.unidirectional.User1;

import com.springdata1.service.impl.CategoryServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryServiceImpl;





    @GetMapping()
    public List<Category> getAll() {
        return categoryServiceImpl.getALL();
    }


    @GetMapping("/{id}")
    public Category getById(@PathVariable int id) {
        return categoryServiceImpl.getById(id);
    }
    @PostMapping()
    public void save(@RequestBody Category cat) {
        categoryServiceImpl.save(cat);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoryServiceImpl.delete(id);
    }

}
