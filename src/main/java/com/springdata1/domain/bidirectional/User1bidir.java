package com.springdata1.domain.bidirectional;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User1bidir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Reviewbidir> reviews;

    @OneToOne
    private Addressbidir address;


}
