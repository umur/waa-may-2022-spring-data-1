package com.example.lab2.repository;

import com.example.lab2.domain.unidirectional.Product_Ud;
import com.example.lab2.domain.unidirectional.User_Ud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_Ud_Repository extends JpaRepository<User_Ud,Integer> {

    List<User_Ud> findAll();

}
