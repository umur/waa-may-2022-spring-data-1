package com.example.springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;

    private String city;

    private String zip;

    @OneToOne
    @JsonIgnore
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
}
