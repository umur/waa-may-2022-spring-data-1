package edu.miu.springdata.service;

import edu.miu.springdata.entity.unidirectional.Address;
import edu.miu.springdata.entity.unidirectional.User;

import java.util.List;

public interface AddressService {

    void save(Address p);
    void delete(int id);
    void update(Address p);
    Address getById(int id);
    List<Address> getAll();

}
