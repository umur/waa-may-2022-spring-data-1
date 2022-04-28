package com.example.springdata.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BiAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    private BiUser user;
}
