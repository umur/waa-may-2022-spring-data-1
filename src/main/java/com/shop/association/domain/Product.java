package com.shop.association.domain;

import com.shop.association.domain.bidirection.joincolumn.Review3;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;
    private Double rating;
    @ManyToOne
    @JoinColumn
    private Category category;
    @OneToMany(mappedBy = "product")
    private List<Review3> review3s;
}
