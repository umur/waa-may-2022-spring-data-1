package com.pprajapati.springdata1.domain.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class UserU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;



    @OneToMany
    @JoinColumn  // if we do not add this it will create mapper table
    private List<ReviewU> reviewsu;

    @OneToOne
    private AddressU addressu;

}
