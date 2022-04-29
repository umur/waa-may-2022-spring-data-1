package com.springdata1.service.impl;

import com.springdata1.domain.unidirectional.Product;
import com.springdata1.domain.unidirectional.User1;
import com.springdata1.repisotory.ProductRepo;
import com.springdata1.repisotory.User1Repo;
import com.springdata1.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private User1Repo user1Repo;
    @Override
    public List<User1> getALL() {
        return (List<User1>) user1Repo.findAll();
    }

    @Override
    public User1 getById(int id) {
        return null;
    }

    @Override
    public void save(User1 user) {

    }

    @Override
    public void delete(int id) {

    }
}
