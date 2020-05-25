package com.hitesh.banking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hitesh.banking.entity.Recipient;

public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}