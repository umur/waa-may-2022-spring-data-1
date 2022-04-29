package com.example.springdata.controller;

import com.example.springdata.dto.AddUserDto;
import com.example.springdata.entity.User;
import com.example.springdata.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody AddUserDto userDto) throws ParseException {
        User user = userService.save(userDto);
        return ResponseEntity.ok(user);
    }
}
