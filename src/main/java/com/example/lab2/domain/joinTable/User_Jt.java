package com.example.lab2.domain.joinTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_Jt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
   // @JoinTable(name = "user_review",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "review_id"))
    private List<Review_Jt> reviewJts;
    @OneToOne
   // @JoinTable(name ="user_address", joinColumns =  @JoinColumn(name ="user_id"),inverseJoinColumns =  @JoinColumn(name = "addresss_id"))
    private Address_Jt addressJt;
}
