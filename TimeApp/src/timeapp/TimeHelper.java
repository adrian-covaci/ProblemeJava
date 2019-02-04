/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeapp;

/**
 *
 * @author cpaad
 */
public class TimeHelper {
    public int value_secunde;
    
    public TimeHelper(int val)
    {
        this.value_secunde = val;
    }
    
    public TimeHelper()
    {
        this.value_secunde = 0;
    }
    
    public int inMinutes()
    {
        return value_secunde / 60;
    }
    
    public int inHours()
    {
        return value_secunde / 3600;
    }
    
//    public String toString()
//    {
//        String content = "";
//        if(this.inHours() ==  1)
//        {
//            content = "o ora";
//        }
//        
//    }
}
