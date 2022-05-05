package com.example.lab2.domain.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review_Jc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String comment;

    @ManyToOne
    //@JoinColumn(name = "user_id")
    private User_Jc userJc;
}
