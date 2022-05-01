package com.example.demo.repository;

import com.example.demo.entity.bidirect.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends  CrudRepository<Customer,Integer> {

    public default Customer geoorgfdgfhgh(String firstName){
        Customer c= new Customer();
        c.setFirstName(firstName);
        return c;
    }
    public List<Customer> getCustomerByEmailAndAddressContaining(String email,String address);
}
