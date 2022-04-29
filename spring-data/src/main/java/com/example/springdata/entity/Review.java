package com.example.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    private User user;
}
