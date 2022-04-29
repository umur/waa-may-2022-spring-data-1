package com.example.lab2.domain.bidirectionalDomain.JoinTable;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JOIN_TABLE_REVIEW")
public class JoinTableReview {
    @Id
    @GeneratedValue
    private Long id;
    private String comment;
    @ManyToOne(cascade=CascadeType.ALL)
    private JoinTableUser user;
}
