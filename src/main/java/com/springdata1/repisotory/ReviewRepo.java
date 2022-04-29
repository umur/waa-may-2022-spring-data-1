package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
}

