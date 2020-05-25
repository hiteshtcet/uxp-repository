package com.hitesh.banking.service;

import java.security.Principal;

import com.hitesh.banking.entity.PrimaryAccount;
import com.hitesh.banking.entity.SavingsAccount;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}