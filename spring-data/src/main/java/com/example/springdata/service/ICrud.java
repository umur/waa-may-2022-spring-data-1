package com.example.springdata.service;

import java.util.List;

public interface ICrud<T, U> {

    public void save(T t);

    public void delete(U id);

    public T getById(U id);

    public List<T> getAll();
}
