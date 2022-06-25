package com.example.springdata.jointable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JoinTableReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;

    @ManyToOne
    private JoinTableUser user;
}
