package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Category;
import com.springdata1.domain.unidirectional.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {

}
