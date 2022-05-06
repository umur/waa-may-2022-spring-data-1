package com.example.lab2.Spring.Data.Service.impl;

import com.example.lab2.Spring.Data.Service.UserService;
import com.example.lab2.Spring.Data.entity.User;
import com.example.lab2.Spring.Data.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public void create(User user) {
        userRepo.save(user);
    }

    @Override
    public void update(User user, int id) {
        user.setId(id);
        userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
