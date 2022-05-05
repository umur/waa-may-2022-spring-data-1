package com.example.lab2.domain.joinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address_Jc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String street;
    private String zip;
    private String city;

    //@OneToOne(mappedBy = "address")
    @OneToOne
    private User_Jc userJc;

}
