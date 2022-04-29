package com.springdata1.service;

import com.springdata1.domain.unidirectional.User1;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<User1> getALL();

    User1 getById(int id);

    void save(User1 user);

    void delete(int id);
}
