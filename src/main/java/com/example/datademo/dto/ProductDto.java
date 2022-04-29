package com.example.datademo.dto;

import com.example.datademo.entity.Category;
import lombok.Data;

@Data
public class ProductDto {
    private int id;
    private String name;
    private Double price;
    private Double rating;
    private Category category;
}
