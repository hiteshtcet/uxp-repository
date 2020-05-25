package com.hitesh.banking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}