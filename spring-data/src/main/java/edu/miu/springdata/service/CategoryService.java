package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.Category;
import edu.miu.springdata.entity.unidirectional.Product;

import java.util.List;

public interface CategoryService {
    void save(Category p);
    void deleteById(int id);
    Category getById(int id);
    List<Category> getAll();
}
