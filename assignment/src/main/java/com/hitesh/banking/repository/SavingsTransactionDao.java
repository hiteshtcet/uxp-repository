package com.hitesh.banking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}