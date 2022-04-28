package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.User;

import java.util.List;

public interface UserService {
    void save(User p);
    void deleteById(int id);
    User getById(int id);
    List<User> getAll();
}
