package com.example.springdata.service;

import com.example.springdata.dto.AddUserDto;
import com.example.springdata.entity.User;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface UserService {
    public User save(AddUserDto user) throws ParseException;

    public void delete(Integer id);

    public User getById(Integer id);

    public List<User> getAll();
}
