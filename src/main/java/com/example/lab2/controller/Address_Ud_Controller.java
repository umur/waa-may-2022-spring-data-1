package com.example.lab2.controller;

import com.example.lab2.domain.AddressDTO;
import com.example.lab2.domain.unidirectional.Address_Ud;
import com.example.lab2.service.Address_Ud_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class Address_Ud_Controller {

    @Autowired
    private Address_Ud_Service service;

    //Creating
    @PostMapping("/address")
    public Address_Ud addUser(@RequestBody AddressDTO addressDTO){

        Address_Ud address = new Address_Ud();
        address.setCity(addressDTO.getCity());
        address.setStreet(addressDTO.getStreet());
        address.setZip(addressDTO.getZip());
        return service.createOrUpdate(address);

    }
    //Reading
    @GetMapping("/address")
    public List<Address_Ud> findAll(){
        return service.findAll();
    }

    //Update
    @PutMapping("/address/{addressId}")
    public Address_Ud updateAddress(@RequestBody AddressDTO addressDTO, @PathVariable int addressId){
        Address_Ud userExisting = service.getAddressById(addressId);

        Address_Ud address = new Address_Ud();
        address.setCity(addressDTO.getCity());
        address.setStreet(addressDTO.getStreet());
        address.setZip(addressDTO.getZip());
        return service.createOrUpdate(address);

    }
    //Delete
    @DeleteMapping("/address/{addressId}")
    public void delete(@PathVariable int userId){
        service.delete(userId);
    }

}
