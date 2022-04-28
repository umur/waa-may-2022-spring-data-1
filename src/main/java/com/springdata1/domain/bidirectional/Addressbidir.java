package com.springdata1.domain.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Addressbidir {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int  id;
   private String street ;
    private String  zip;
   private String city;
   @OneToOne
   private User1bidir user1bidir;


}
