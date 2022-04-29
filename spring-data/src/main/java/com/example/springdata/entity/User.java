package com.example.springdata.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
@Data
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

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Review> reviews;

    public void setAddress(Address address) {
        this.address = address;
    }
}
