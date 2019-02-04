/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author cpaad
 */
public class House {
    public int numarCamere;
    public double suprafata;
    public int nivele;
    public boolean garaj = false;
    
    public House()
    {
        numarCamere = 0;
        nivele = 0;
        suprafata = 0;
    }
    
    public House(int numarCamere, double suprafata, int nivele)
    {
        this.numarCamere = numarCamere;
        this.suprafata = suprafata;
        this.nivele = nivele;
    }
    
    public void createGaraj()
    {
        garaj = true;
        suprafata += 40;
    }
    
    public void createCamera()
    {
        suprafata += 30;
        numarCamere +=1;
    }
    
    public void destroyCamera()
    {
        numarCamere -=1;
    }
    
    public void createEtaj()
    {
        suprafata += 60;
        nivele +=1;
    }
      
}
