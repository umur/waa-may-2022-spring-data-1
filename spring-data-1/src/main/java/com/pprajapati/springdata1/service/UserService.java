package com.pprajapati.springdata1.service;

import com.pprajapati.springdata1.domain.*;

import java.util.List;

public interface UserService {
    void save(User p);

    void delete(int id);

    User getById(int id);

    List<User> getAll();


}
