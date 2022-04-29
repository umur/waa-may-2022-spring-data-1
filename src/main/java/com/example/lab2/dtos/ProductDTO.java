package com.example.lab2.dtos;

import com.example.lab2.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private double price;
    private double rating;
    private String category;
}
