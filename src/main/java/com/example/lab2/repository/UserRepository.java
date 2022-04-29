package com.example.lab2.repository;

import com.example.lab2.domain.Category;
import com.example.lab2.domain.bidirectionalDomain.JoinColumn.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
