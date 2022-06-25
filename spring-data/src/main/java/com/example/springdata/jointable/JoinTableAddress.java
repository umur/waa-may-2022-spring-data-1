package com.example.springdata.jointable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JoinTableAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    private JoinTableUser user;
}
