package com.example.lab2.domain.joinTable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review_Jt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String comment;

    @ManyToOne
    private User_Jt userJt;
}
