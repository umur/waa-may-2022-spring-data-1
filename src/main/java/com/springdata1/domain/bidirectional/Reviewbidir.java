package com.springdata1.domain.bidirectional;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Reviewbidir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String comment;

    @ManyToOne
    private User1bidir user1bidir;
}
