package com.example.demo.entity.bidirect;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private  double price;
    private  double rating;
    @ManyToOne
    @JsonBackReference
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
