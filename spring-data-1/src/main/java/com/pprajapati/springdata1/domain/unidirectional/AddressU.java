package com.pprajapati.springdata1.domain.unidirectional;
import lombok.Data;

import javax.persistence.*;



@Entity
@Data
public class AddressU{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

}
