package com.example.springdata.joincolumn;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class JoinColumnAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    private JoinColumnUser user;
}
