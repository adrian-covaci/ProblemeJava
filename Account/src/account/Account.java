/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author cpaad
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cont cont_curent = new cont(1122, 20000, 4.5);
        cont_curent.deposit(3000);
        System.out.println(cont_curent.getBalance());
        System.out.println(cont_curent.getMonthlyInterest());
        System.out.println(cont_curent.getDate());
        
    }
    
}
