package problemcolegiu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cpaad
 */
public class Operatii {
    
    public static NumereComplexe adunare(NumereComplexe n1, NumereComplexe n2) {
        NumereComplexe n3 = new NumereComplexe();
        n3.re = n1.re + n2.re;
        n3.im = n1.im + n2.im;
        return n3;
    }
    
    public static NumereComplexe inmultire(NumereComplexe n1, NumereComplexe n2) {
        NumereComplexe n3 = new NumereComplexe();
        n3.re = (n1.re*n2.re - n1.im * n2.im);
        n3.im = (n1.re * n2.im  + n1.im * n2.re);
        return n3;
    }
}
