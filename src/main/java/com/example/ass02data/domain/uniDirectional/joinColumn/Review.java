package com.example.ass02data.domain.uniDirectional.joinColumn;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

}
