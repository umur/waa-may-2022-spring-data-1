package com.example.springdata.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BiReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;

    @ManyToOne
    private BiUser user;
}
