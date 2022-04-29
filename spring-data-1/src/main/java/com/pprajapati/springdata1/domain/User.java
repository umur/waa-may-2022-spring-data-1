package com.pprajapati.springdata1.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

//    @OneToMany(mappedBy = "user")
//    private List<Review> reviews;

    @OneToOne
    private Address address;
}
