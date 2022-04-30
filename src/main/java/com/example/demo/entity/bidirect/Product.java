package com.example.demo.entity.bidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private  double price;
    private  double rating;
    @ManyToOne
    private Category category;
}
