package com.pprajapati.springdata1.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="catagories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
//    @JsonManagedReference

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
