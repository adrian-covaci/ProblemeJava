/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Scanner;

/**
 *
 * @author cpaad
 */
public class Carte {
    public String titlu;
    public String autor;
    public String editura;
    public int numarPagini;
    
    public Carte() { 
        this.titlu = "";
        this.autor = "";
        this.editura = "";
        this.numarPagini = 0;
    }
    
    public Carte(String titlu, String autor, String editura, int numarPagini) { 
        this.titlu = titlu;
        this.autor  = autor;
        this.editura = editura;
        this.numarPagini = numarPagini;
    }
    
    public String getTitlu() {
        return this.titlu;
    }
    
    public String getAutor() { 
        return this.autor;
    }
    
    public String getEditura() { 
        return this.editura;
    }
    
    public void citire() {
        Scanner s  = new Scanner(System.in);
        this.titlu = s.nextLine();
        this.autor = s.nextLine();
        this.editura = s.nextLine();
        this.numarPagini = Integer.parseInt(s.nextLine());
        if(numarPagini <= 0 )
        {
            throw new java.lang.Error("Nr pagini > 0");
        }
        
    }
    
    public String toString() {
        return titlu.toUpperCase() + ", " + autor + ", " + editura.toLowerCase();
    }
    
}
