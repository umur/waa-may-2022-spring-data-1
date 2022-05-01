package com.example.demo.service;

import com.example.demo.entity.bidirect.Customer;
import com.example.demo.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo customerRepo;

    public Customer  fgfgfgfgfg(String c){
       // customerRepo.save(c);
//        customerRepo.findAll()
       // customerRepo.flush();
      customerRepo.getCustomerByEmailAndAddressContaining("","");
      return  customerRepo.geoorgfdgfhgh("geo");
    }
}
