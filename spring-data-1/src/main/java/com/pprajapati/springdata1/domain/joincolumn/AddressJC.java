package com.pprajapati.springdata1.domain.joincolumn;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressJC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}