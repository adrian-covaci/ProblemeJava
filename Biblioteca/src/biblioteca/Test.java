/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author cpaad
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carte c1 = new Carte("Ion", "Ion2", "editura1", 1223);
        Carte c2 = new Carte("Ion", "Ion2", "editura1", 321);
//        if(!Verificari.duplicat(c1, c2))
//        {
//            System.out.println("Lol");
//        }
//        c1.citire();
        System.out.println(c2);
        System.out.println(Verificari.compare_pages(c1, c2));
       
    }
    
}
