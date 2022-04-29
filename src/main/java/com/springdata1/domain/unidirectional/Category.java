package com.springdata1.domain.unidirectional;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @Fetch(FetchMode.JOIN)
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private List<Product> products;

}
