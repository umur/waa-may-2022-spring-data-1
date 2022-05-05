package com.example.lab2.repository;


import com.example.lab2.domain.unidirectional.Review_Ud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Review_Ud_Repository extends JpaRepository<Review_Ud,Integer> {
    List<Review_Ud> findAll();
}
