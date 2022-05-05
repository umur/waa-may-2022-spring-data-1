package com.example.lab2.service;

import com.example.lab2.domain.unidirectional.Category_Ud;
import com.example.lab2.repository.Category_Ud_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class Category_Ud_Service {

    private Category_Ud_Repository repository;

    public Category_Ud createOrUpdate(Category_Ud category){

        return repository.save(category);
    }
    public Category_Ud update(Category_Ud category, int categoryId){
        return  repository.save(category);
    }
    public List<Category_Ud> findAll(){
        return  repository.findAll();
    }

    public Optional<Category_Ud> findById(Integer id){
        return repository.findById(id);
    }

    public void  delete(Integer categoryId){
        repository.deleteById(categoryId);
    }

    public Category_Ud getCategoryById(Integer id){
        return repository.findById(id).orElse(null);
    }


}
