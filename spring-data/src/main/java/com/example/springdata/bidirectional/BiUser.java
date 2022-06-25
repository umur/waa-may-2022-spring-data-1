package com.example.springdata.bidirectional;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "biusers")
public class BiUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    private BiAddress address;

    @OneToMany
    private List<BiReview> reviews;
}
