package com.example.springdata.joincolumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JoinColumnReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String comment;

    @ManyToOne
    private JoinColumnUser user;
}
