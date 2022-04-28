package edu.miu.springdata.service;

import edu.miu.springdata.DTO.CategoryDto;
import edu.miu.springdata.entity.unidirectional.Category;
import edu.miu.springdata.entity.unidirectional.Product;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto p);
    void deleteById(int id);
    CategoryDto getById(int id);
    List<CategoryDto> getAll();
}
