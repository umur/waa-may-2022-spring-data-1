package com.example.springdata.joincolumn;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "join_column_users")
public class JoinColumnUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    @JoinColumn
    private JoinColumnAddress address;

    @OneToMany
    @JoinColumn
    private List<JoinColumnReview> reviews;
}
