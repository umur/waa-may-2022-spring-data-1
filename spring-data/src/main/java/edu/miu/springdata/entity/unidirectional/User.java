package edu.miu.springdata.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
//    Uncomment for one to many unidirectional mapping
    @OneToMany
    @JoinColumn(name = "review_id")
    private List<Review> reviews;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
