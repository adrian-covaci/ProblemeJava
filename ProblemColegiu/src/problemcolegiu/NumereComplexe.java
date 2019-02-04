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
public class NumereComplexe {
    public float re;
    public float im;
    
    public NumereComplexe() {
        this.re = 0;
        this.im = 0;
    }
    
    public NumereComplexe(float real, float imag) {
        this.re = real;
        this.im = imag;
    }
    
    public void show() { 
        System.out.println(this.re + " + " +  this.im + "i");
    }
}
