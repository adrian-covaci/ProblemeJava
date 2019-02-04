/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemcolegiu;

/**
 *
 * @author cpaad
 */
public class ProblemColegiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumereComplexe n1 = new NumereComplexe(3, 4);
        NumereComplexe n2 = new NumereComplexe(2, 3);
        NumereComplexe n3 = Operatii.inmultire(n1, n2);
        n3.show();
        
        
        
        
        
    }
    
}
