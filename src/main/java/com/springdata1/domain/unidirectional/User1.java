package com.springdata1.domain.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany
    @JoinColumn(name="user-id")
    private List<Review> reviews;

    @OneToOne
    private Address address;


}
