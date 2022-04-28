package com.example.lab2.domain.bidirectionalDomain.JoinTable;

import com.example.lab2.domain.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JOIN_TABLE_USER")
public class JoinTableUser {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<JoinTableReview> reviews;


}
