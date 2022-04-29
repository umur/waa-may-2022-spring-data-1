package com.springdata1.controller;

import com.springdata1.domain.unidirectional.Product;
import com.springdata1.domain.unidirectional.User1;
import com.springdata1.service.impl.ProductServiceImpl;
import com.springdata1.service.impl.UserServiceImpl;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;





        @GetMapping()
        public List<User1> getAll() {
        return userServiceImpl.getALL();
    }


        @GetMapping("/{id}")
        public User1 getById(@PathVariable int id) {
        return userServiceImpl.getById(id);
    }
        @PostMapping()
        public void save(@RequestBody User1 user) {
            userServiceImpl.save(user);

    }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable int id) {
            userServiceImpl.delete(id);
    }



}
