package com.example.springdata.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

//    @OneToOne
//    private User user;
}
