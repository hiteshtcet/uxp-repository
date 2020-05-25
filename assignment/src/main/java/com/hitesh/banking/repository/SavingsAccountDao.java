package com.hitesh.banking.repository;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}