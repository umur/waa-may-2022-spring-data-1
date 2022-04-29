package com.example.lab2.domain;

import com.example.lab2.domain.bidirectionalDomain.JoinColumn.Review;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private double rating;

    @ManyToOne
    private Category category;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="PRODUCT_FK")
    private List<Review> reviews;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id != null && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
