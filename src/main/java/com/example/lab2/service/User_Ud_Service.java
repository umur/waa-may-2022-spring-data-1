package com.example.lab2.service;

import com.example.lab2.domain.unidirectional.Product_Ud;
import com.example.lab2.domain.unidirectional.User_Ud;
import com.example.lab2.repository.Product_Ud_Repository;
import com.example.lab2.repository.User_Ud_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class User_Ud_Service {

    private User_Ud_Repository repository;

    public User_Ud createOrUpdate(User_Ud user){

        return repository.save(user);
    }
    public User_Ud update(User_Ud user, int userId){
        return  repository.save(user);
    }
    public List<User_Ud> findAll(){
        return  repository.findAll();
    }

    public Optional<User_Ud> findById(Integer id){
        return repository.findById(id);
    }

    public void  delete(Integer userId){
        repository.deleteById(userId);
    }

    public User_Ud getUserById(Integer id){
        return repository.findById(id).orElse(null);
    }


}
