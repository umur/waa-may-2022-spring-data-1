package com.springdata1.service;

import com.springdata1.domain.unidirectional.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getALL();

    Category getById(int id);

    void save(Category cat);

    void delete(int id);


}
