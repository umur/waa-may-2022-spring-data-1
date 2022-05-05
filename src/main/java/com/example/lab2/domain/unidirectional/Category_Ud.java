package com.example.lab2.domain.unidirectional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data // getters and setters
@AllArgsConstructor
@NoArgsConstructor
public class Category_Ud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private  String name;

    @OneToMany
    private  List<Product_Ud> productUds;
}
