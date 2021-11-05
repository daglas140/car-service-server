package com.gawlas.CarServiceServer.repository;

import com.gawlas.CarServiceServer.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserName(String username);
}
