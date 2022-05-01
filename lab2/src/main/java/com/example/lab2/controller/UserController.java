package com.example.lab2.controller;

import com.example.lab2.dto.UserDTO;
import com.example.lab2.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.getAll();
    }

    @PostMapping
    public void save(@RequestBody UserDTO userDTO){
        userService.save(userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody UserDTO userDTO){
        userService.update(id, userDTO);
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable int id){
        return userService.getById(id);
    }
}
