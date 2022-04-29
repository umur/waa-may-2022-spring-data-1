package com.pprajapati.springdata1.repo;

import com.pprajapati.springdata1.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
