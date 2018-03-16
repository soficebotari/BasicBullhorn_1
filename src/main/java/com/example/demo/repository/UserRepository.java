package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Message;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
    User findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String email);

}
