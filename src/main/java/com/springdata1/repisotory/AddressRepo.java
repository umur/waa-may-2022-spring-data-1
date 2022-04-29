package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {
}
