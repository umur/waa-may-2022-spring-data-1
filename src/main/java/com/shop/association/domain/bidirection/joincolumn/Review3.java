package com.shop.association.domain.bidirection.joincolumn;

import com.shop.association.domain.Product;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "reviews3")
@Entity
public class Review3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    @ManyToOne
    @JoinColumn
    private User3 user3;
    @ManyToOne
    @JoinColumn
    private Product product;
}
