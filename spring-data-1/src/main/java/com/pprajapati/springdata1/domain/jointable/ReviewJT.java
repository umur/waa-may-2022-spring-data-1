package com.pprajapati.springdata1.domain.jointable;

import com.pprajapati.springdata1.domain.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReviewJT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jtid;
    private String commentjt;
}
