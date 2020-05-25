package com.hitesh.banking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}