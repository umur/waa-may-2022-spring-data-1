package com.pprajapati.springdata1.domain.jointable;

import com.pprajapati.springdata1.domain.User;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class AddressJT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private UserJT userjt;

}
