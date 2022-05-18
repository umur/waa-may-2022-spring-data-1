package com.example.lab2.repostory;

import com.example.lab2.domain.Address;
import com.example.lab2.dto.AddressDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {


}
