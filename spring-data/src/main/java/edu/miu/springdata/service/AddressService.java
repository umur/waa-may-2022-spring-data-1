package edu.miu.springdata.service;

import edu.miu.springdata.DTO.AddressDto;
import edu.miu.springdata.entity.unidirectional.Address;
import edu.miu.springdata.entity.unidirectional.User;

import java.util.List;

public interface AddressService {

    void save(AddressDto p);
    void deleteById(int id);
    AddressDto getById(int id);
    List<AddressDto> getAll();

}
