package com.example.springdata.unidirectional;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "uniusers")
public class UniUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    private UniAddress address;

    @OneToMany
    private List<UniReview> reviews;
}
