package com.springdata1.repisotory;

import com.springdata1.domain.unidirectional.User1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User1Repo extends CrudRepository<User1,Integer> {

}
