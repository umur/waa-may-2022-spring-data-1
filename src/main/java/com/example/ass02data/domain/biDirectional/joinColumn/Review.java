package com.example.ass02data.domain.biDirectional.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @ManyToOne
    private User user;
}
