package com.company.bank;

public class BankTeller {

    public void deposit(BankAccount account, double amount) {
        boolean result = account.deposit(amount);
        if (result) {
            System.out.println("Successful deposit of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }

    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
    
    public static void transfer(BankAccount account1, BankAccount account2, double amount)
    {
        if(amount > 0 && amount <= account1.balance*0.5)
        {
            account2.balance += amount;
            account1.balance -= amount;
        }
        else {
            System.out.println("The transferable amount should be at most 50% of the sender's balance.");
        }
    }
}
