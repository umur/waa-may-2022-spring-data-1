package com.example.lab2.repository;

import com.example.lab2.domain.unidirectional.Address_Ud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Address_Ud_Repository extends JpaRepository<Address_Ud, Integer> {
    List<Address_Ud> findAll();
}
