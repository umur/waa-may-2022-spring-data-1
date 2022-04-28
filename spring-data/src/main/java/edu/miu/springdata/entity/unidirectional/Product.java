package edu.miu.springdata.entity.unidirectional;

import edu.miu.springdata.entity.bidirectional.CategoryBi;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private float price;
    private int rating;

}
