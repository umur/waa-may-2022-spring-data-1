package edu.miu.springdata.DTO;

import edu.miu.springdata.entity.unidirectional.Address;
import edu.miu.springdata.entity.unidirectional.Review;
import lombok.Data;
import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviews;
    private Address address;
}
