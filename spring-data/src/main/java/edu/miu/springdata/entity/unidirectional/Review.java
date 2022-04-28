package edu.miu.springdata.entity.unidirectional;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

}
