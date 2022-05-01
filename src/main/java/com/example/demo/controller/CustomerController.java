package com.example.demo.controller;

import com.example.demo.entity.bidirect.Customer;
import com.example.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Column;

@Controller
@RequiredArgsConstructor
public class CustomerController {
  private final   CustomerService customerService;
    @GetMapping("/customer/{n}")
        public Customer ghgh(@PathVariable String n) {
            return customerService.fgfgfgfgfg(n);
        }
}
