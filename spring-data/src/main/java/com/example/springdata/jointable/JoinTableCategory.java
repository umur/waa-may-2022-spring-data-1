package com.example.springdata.jointable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class JoinTableCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    @JoinTable(name="join_table_category_product")
    private List<JoinTableProduct> products;
}
