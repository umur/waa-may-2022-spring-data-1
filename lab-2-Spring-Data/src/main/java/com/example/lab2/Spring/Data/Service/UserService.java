package com.example.lab2.Spring.Data.Service;

import com.example.lab2.Spring.Data.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> getAll();

    Optional<User> getUserById(int id);

    void create(User user);

    void update(User user, int id);

    void delete(int id);
}
