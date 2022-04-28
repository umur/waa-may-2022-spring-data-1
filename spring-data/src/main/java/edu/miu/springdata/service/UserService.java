package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.User;

import java.util.List;

public interface UserService {
    void save(User p);
    void delete(int id);
    void update(User p);
    User getById(int id);
    List<User> getAll();
}
