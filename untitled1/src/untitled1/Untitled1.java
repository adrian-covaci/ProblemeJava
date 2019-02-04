/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package untitled1;

import com.company.bank.BankAccount;
import com.company.bank.BankTeller;

/**
 *
 * @author cpaad
 */
public class Untitled1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount b1 = new BankAccount(2,5000);
        BankAccount b2 = new BankAccount(2,7000);
        BankTeller.transfer(b1, b2, 3000);
    }
    
}
