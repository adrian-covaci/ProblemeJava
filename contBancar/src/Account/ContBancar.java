/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author cpaad
 */
public class ContBancar{
	
	public static int nextAccount = 1;

	public String name;
	public int accountNumber;
	public int balance;

	public ContBancar(String n){
		name = new String(n);
		accountNumber = nextAccount;
		balance = 0;

		nextAccount++;
	}

	public ContBancar(String n, int b){
		name = new String(n);
		accountNumber = nextAccount;
		balance = b;

		nextAccount++;
	}

	public void deposit(int b){
		balance = balance + b;
	}

	public String toString(){
		return "\nname: " + name + "\naccount number: " + accountNumber + "\nbalance: " + balance;
	}
        
        public String withdraw(int sum)
        {
            return (balance >= sum) ? "Adevarat" : "Fals";
        }
}