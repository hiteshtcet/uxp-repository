package com.hitesh.banking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}