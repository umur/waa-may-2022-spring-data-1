package com.example.lab2.repository;


import com.example.lab2.domain.unidirectional.Category_Ud;
import com.example.lab2.domain.unidirectional.Product_Ud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Category_Ud_Repository extends JpaRepository <Category_Ud, Integer> {

    List<Category_Ud> findAll();

}
