package com.example.demo.entity.bidirect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Review {
    @Id
    private  int id;
    private String comment;
    @ManyToOne
    private Customer customer;
}
