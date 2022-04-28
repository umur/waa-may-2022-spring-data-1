package edu.miu.springdata.entity.unidirectional;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
       @OneToMany
       @JoinColumn(name = "productId")
    private List<Product> products;

}
