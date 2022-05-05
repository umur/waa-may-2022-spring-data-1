package com.example.lab2.domain.joinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Jc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //@OneToMany(mappedBy = "user")
    @OneToMany
    private List<Review_Jc> reviewJcs;
    @OneToOne
    //@JoinColumn(name = "address_id")
    private Address_Jc addressJc;
}
