package com.example.demo.entity.bidirect;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Review {
    @Id
    private  int id;
    private String comment;
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;
}
