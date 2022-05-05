package com.example.lab2.domain.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review_Bi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String comment;

    @ManyToOne
    private User_Bi userBi;
}
