package com.example.lab2.service;

import com.example.lab2.domain.unidirectional.Address_Ud;
import com.example.lab2.domain.unidirectional.User_Ud;
import com.example.lab2.repository.Address_Ud_Repository;
import com.example.lab2.repository.User_Ud_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Address_Ud_Service {

    private Address_Ud_Repository repository;


    public Address_Ud createOrUpdate(Address_Ud address){

        return repository.save(address);
    }
    public Address_Ud update(Address_Ud address, int addressId){
        return  repository.save(address);
    }
    public List<Address_Ud> findAll(){
        return  repository.findAll();
    }

    public Optional<Address_Ud> findById(Integer id){
        return repository.findById(id);
    }

    public void  delete(Integer addressId){
        repository.deleteById(addressId);
    }

    public Address_Ud getAddressById(Integer id){
        return repository.findById(id).orElse(null);
    }

}
