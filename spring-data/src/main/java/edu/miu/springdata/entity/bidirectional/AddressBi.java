package edu.miu.springdata.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressBi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String zip;
    private String city;


     @OneToOne(mappedBy="address")
     private UserBi user;

}
