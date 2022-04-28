package com.example.lab2.domain.bidirectionalDomain.JoinColumn;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "JOIN_COLUMN_REVIEW")
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private String comment;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="USER_FK")
    private User user;
}
