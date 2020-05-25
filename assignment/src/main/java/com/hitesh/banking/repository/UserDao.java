package com.hitesh.banking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.User;

public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();
}