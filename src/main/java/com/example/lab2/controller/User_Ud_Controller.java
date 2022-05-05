package com.example.lab2.controller;


import com.example.lab2.domain.UserDTO;
import com.example.lab2.domain.unidirectional.User_Ud;
import com.example.lab2.service.User_Ud_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class User_Ud_Controller {

    @Autowired
    private User_Ud_Service service;

    //Creating
    @PostMapping("/users")
    public User_Ud addUser(@RequestBody UserDTO userDTO){

        User_Ud user = new User_Ud();
        user.setFirstName(userDTO.getFirstName());
        user.setEmail(userDTO.getEmail());
        user.setLastName(userDTO.getLastName());
        return service.createOrUpdate(user);

    }
    //Reading
    @GetMapping("/users")
    public List<User_Ud> findAll(){
        return service.findAll();
    }

    //Update
    @PutMapping("/user/{userId}")
    public User_Ud updateUser(@RequestBody UserDTO userDTO, @PathVariable int userId){
        User_Ud userExisting = service.getUserById(userId);

        User_Ud user = new User_Ud();
        user.setFirstName(userDTO.getFirstName());
        user.setEmail(userDTO.getEmail());
        user.setLastName(userDTO.getLastName());
        return service.createOrUpdate(user);

    }
    //Delete
    @DeleteMapping("/user/{userId}")
    public void delete(@PathVariable int userId){
        service.delete(userId);
    }

}
