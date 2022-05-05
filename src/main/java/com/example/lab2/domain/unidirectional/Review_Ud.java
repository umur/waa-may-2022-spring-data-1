package com.example.lab2.domain.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Review_Ud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String comment;


}
