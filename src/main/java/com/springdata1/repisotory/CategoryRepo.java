package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Category;
import com.springdata1.domain.unidirectional.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepo extends CrudRepository<Category,Integer> {

}
