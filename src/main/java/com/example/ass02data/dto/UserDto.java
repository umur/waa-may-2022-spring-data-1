package com.example.ass02data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String fName;
    private String lName;
    private String email;
    private String password;

    private List<ReviewDto> review;

    private AddressDto address;
}
