package threads.deadlocks.problem;

import lombok.Getter;

@Getter
public class BankAccount {
    public int balance;

    public String name;

    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

}