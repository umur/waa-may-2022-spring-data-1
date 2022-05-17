package com.example.ass02data.domain.biDirectional.joinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @OneToOne
    private User user;
}
