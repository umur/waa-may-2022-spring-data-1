package com.springdata1.domain.bidirectional;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Categorybidir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(mappedBy = "categorbidir")
    //@JoinColumn(name="category_id")
    private List<Productbidir> productbidirs;

}
