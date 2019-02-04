package com.company;
import com.company.bank.BankAccount;
import com.company.bank.BankTeller;
import com.company.atm.ATM;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(1234,100.00);
        BankTeller john = new BankTeller();
        john.deposit(a,100.00);
        ATM xyz = new ATM(222);
        xyz.withdraw(a,50.00);
    }
}