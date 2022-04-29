package com.pprajapati.springdata1.service.impl;

import com.pprajapati.springdata1.domain.User;
import com.pprajapati.springdata1.repo.UserRepo;
import com.pprajapati.springdata1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Override
    public void save(User p) {
        userRepo.save(p);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return (User) userRepo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return StreamSupport.stream(userRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
