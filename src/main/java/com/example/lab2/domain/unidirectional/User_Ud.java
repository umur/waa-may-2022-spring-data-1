package com.example.lab2.domain.unidirectional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Ud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    private List<Review_Ud> reviewUds;
    @OneToOne
    private Address_Ud addressUd;
}
