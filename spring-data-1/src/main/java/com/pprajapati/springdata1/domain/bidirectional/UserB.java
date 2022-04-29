package com.pprajapati.springdata1.domain.bidirectional;

import com.pprajapati.springdata1.domain.Address;
import com.pprajapati.springdata1.domain.Review;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "userb")
    private List<ReviewB> reviewsb;

    @OneToOne
    private AddressB addressb;
}
