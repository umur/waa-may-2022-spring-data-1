package com.pprajapati.springdata1.service;

import com.pprajapati.springdata1.domain.*;

import java.util.List;

public interface CategoryService {
    void save(Category p);

    void delete(int id);

    Category getById(int id);

    List<Category> getAll();
}
