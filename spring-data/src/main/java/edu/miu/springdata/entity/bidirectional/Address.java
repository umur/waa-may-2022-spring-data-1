package edu.miu.springdata.entity.bidirectional;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String zip;
    private String city;


     @OneToOne(mappedBy="address")
     private User user;

}
