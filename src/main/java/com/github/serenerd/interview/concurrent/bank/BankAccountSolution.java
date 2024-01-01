package com.github.serenerd.interview.concurrent.bank;

import lombok.Data;

@Data
public class BankAccountSolution {

    private long amount;

    public boolean transferTo(BankAccountSolution another, long amount) {
        synchronized (this) {
            boolean result;
            if (this.amount >= amount) {
                another.amount += amount;
                this.amount -= amount;
                result = true;
            } else {
                result = false;
            }
            return result;
        }
    }
}