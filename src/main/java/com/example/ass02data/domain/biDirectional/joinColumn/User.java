package com.example.ass02data.domain.biDirectional.joinColumn;

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

    @OneToMany(mappedBy = "employee_id")
    private List<Review> reviews;

    @JoinColumn(name = "employee_id")
    @OneToOne
    private Address address;

}
