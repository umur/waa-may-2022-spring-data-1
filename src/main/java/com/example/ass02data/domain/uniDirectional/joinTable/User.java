package com.example.ass02data.domain.uniDirectional.joinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    @OneToMany
    private List<Review> reviews;
    @OneToOne
    private Address address;

}
