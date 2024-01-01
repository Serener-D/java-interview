package com.github.serenerd.interview.concurrent.bank;

import lombok.Data;

@Data
public class BankAccount {

    private long amount;

    /**
     * Implement a ThreadSafe money transfer from this BankAccount to another BankAccount
     * Assume that multiple threads may call this BankAccount::transferTo
     * After method execution, the specified amount of money should be withdrawn from this BankAccount and added to another BankAccount
     * Return true if the operation was successful ot false if otherwise
     */
    public boolean transferTo(BankAccount another, long amount) {
        return true;
    }
}