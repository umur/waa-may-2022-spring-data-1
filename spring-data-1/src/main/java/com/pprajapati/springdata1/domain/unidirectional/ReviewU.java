package com.pprajapati.springdata1.domain.unidirectional;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ReviewU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String commentu;
}
