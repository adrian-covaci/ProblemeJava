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
public class Verificari {
    public static boolean duplicat(Carte m1, Carte m2)
    {
        return m1.titlu == m2.titlu && m2.editura == m1.editura;
    }
    
    public static Carte compare_pages(Carte m1, Carte m2)
    {
       return (m1.numarPagini > m2.numarPagini) ? m1 : m2;
    }
}
