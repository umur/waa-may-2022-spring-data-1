package com.example.springdata.jointable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "join_table_users")
public class JoinTableUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToOne
    @JoinTable(name="join_table_user_address")
    private JoinTableAddress address;

    @OneToMany
    @JoinTable
    private List<JoinTableReview> reviews;
}
