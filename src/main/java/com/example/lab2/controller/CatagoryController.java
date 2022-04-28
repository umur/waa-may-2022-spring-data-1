package com.example.lab2.controller;

import com.example.lab2.domain.Category;
import com.example.lab2.dtos.CategoryDTO;
import com.example.lab2.service.CategoryService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
public class CatagoryController {
    private final CategoryService categoryService;
    public CatagoryController(CategoryService categoryService){this.categoryService = categoryService;}

    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        Optional<CategoryDTO> optionalCategory = Optional.ofNullable(categoryService.createCategory(category));
        System.out.println(category);
        return new ResponseEntity<>(optionalCategory.get(), HttpStatus.CREATED);
    }

}
