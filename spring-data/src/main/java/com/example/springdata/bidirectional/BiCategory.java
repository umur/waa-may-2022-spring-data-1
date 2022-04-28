package com.example.springdata.bidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class BiCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<BiProduct> products;
}
