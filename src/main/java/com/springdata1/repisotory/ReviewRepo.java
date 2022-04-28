package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<Review,Integer> {
}
