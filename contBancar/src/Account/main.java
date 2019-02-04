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
public class main {
    public static void main(String[] args) {
                ContBancar alice = new ContBancar("Alice", 100);
		ContBancar bob = new ContBancar("Bob");

		System.out.println(alice);
		System.out.println(bob);
	    
	    System.out.println(alice.nextAccount);
		System.out.println(bob.nextAccount);
		System.out.println(ContBancar.nextAccount);
                System.out.println(alice.withdraw(23));
        
    }
}
