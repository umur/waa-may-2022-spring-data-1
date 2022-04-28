package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.Category;
import edu.miu.springdata.entity.unidirectional.Product;

import java.util.List;

public interface CategoryService {
    void save(Category p);
    void delete(int id);
    void update(Category p);
    Category getById(int id);
    List<Category> getAll();
}
