package com.example.lab2.domain.bidirectional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address_Bi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private User_Bi userBi;

}
