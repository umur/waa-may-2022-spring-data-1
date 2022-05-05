package com.example.lab2.Spring.Data.repository;

import com.example.lab2.Spring.Data.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
