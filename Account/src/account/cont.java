/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cpaad
 */
public class cont {
    public int id;
    public double balance;
    public double annualInterestRate;
    public Date dateCreated;
    
    public cont()
    {
        id = 0;
        balance = annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public cont(int i, double b, double an )
    {
        this.id = i;
        this.balance = b;
        this.annualInterestRate = an;
        this.dateCreated = new Date();
    }
    
    public int getID()
    {
        return this.id;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    
    public String getDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(this.dateCreated);
    }
    
    public void withDraw(double i)
    {
        if(balance >= i)
        {
            balance =- i;
        }
        else
        {
            System.out.print("Insufficient funds");
        }
    }
    
    public void deposit(double i)
    {
        balance += i;
    }
    
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest()
    {
        return this.getMonthlyInterestRate() * 100 * this.balance;
    }
}
