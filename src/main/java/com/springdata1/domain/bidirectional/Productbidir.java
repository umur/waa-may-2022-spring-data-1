package com.springdata1.domain.bidirectional;

import com.springdata1.domain.unidirectional.Category;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Productbidir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private String rating;
    @ManyToOne
    private Categorybidir categorybidir;

}
