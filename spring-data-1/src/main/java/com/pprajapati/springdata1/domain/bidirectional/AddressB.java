package com.pprajapati.springdata1.domain.bidirectional;

import com.pprajapati.springdata1.domain.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private UserB userb;
}
