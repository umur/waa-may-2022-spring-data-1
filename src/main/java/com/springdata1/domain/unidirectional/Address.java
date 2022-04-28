package com.springdata1.domain.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int  id;
   private String street ;
    private String  zip;
   private String city;

}
