package com.pprajapati.springdata1.repo;

import com.pprajapati.springdata1.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
