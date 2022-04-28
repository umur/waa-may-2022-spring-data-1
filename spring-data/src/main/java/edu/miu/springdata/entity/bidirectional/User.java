package edu.miu.springdata.entity.bidirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
