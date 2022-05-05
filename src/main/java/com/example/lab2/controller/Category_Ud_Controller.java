package com.example.lab2.controller;


import com.example.lab2.domain.CategoryDTO;
import com.example.lab2.domain.unidirectional.Category_Ud;
import com.example.lab2.service.Category_Ud_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Category_Ud_Controller {
    @Autowired
    private Category_Ud_Service serviceCategory;

    //Creating
    @PostMapping("/category")
    public Category_Ud addCategory(@RequestBody CategoryDTO categoryDTO){

        Category_Ud category = new Category_Ud();
        category.setName(categoryDTO.getName());
        return serviceCategory.createOrUpdate(category);

    }

    //Reading
    @GetMapping("/category")
    public List<Category_Ud> findAll(){
        return serviceCategory.findAll();
    }

    //Update
    @PutMapping("/category/{categoryId}")
    public Category_Ud updateCategory(@RequestBody CategoryDTO categoryDTO,@PathVariable int categoryId){
        System.out.println(categoryId);
        Category_Ud categoryExisting = serviceCategory.getCategoryById(categoryId);

        Category_Ud category = new Category_Ud();
        category.setName(categoryDTO.getName());

        return serviceCategory.update(category,categoryId);

    }
    //Delete
    @DeleteMapping("/category/{categoryId}")
    public void delete(@PathVariable int categoryId){
        System.out.println(categoryId);
        serviceCategory.delete(categoryId);
    }

}








