package edu.miu.springdata.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserBi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
    private List<ReviewBi> reviews;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressBi address;
}
