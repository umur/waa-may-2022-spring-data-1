package edu.miu.springdata.entity.bidirectional;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @ManyToOne
    private User user;
}
