package com.example.springdata.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    private Address address;
}
