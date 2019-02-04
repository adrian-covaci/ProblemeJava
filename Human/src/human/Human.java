/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author cpaad
 */
import java.util.Date;

public class Human {
    char gender;
    String firstNames, lastName;
    Human partner;
    int identificationNumber;
    int yearBirth;
    int monthBirth;
    int dayBirth;
    
    public Human (String firstNames, String lastName, char gender) {
        this.firstNames = firstNames;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public void speak(String words) {
        System.out.println(words);
    }
    
    public void addPartner(Human humanCouple) {
        this.partner = humanCouple;
        humanCouple.partner = this;
    }
    
    public Human getPartner() {
        return this.partner;
    }
    
    public void setId (int id) {
        identificationNumber = id;
    }
    
    public int getId() {
        return identificationNumber;
    }
    
    public void setBirthDate(int year, int month, int day) {
        yearBirth = year;
        monthBirth = month;
        dayBirth = day;
    }
    
    public String getFullName() {
        return this.firstNames + " " + this.lastName;
    }
    
    public int getAge() {
        Date today = new Date();
        
        //anul curent minus 1900.
        int currentYear = today.getYear() + 1900; 
        int age = currentYear - yearBirth;
        
        //0 este Ianuarie, deci se adauga 1
        int currentMonth = today.getMonth() + 1; 
        if (currentMonth < monthBirth) {
            age--;
        } else if (currentMonth == monthBirth) {
            //zile in luna
            int currentDay = today.getDate(); 
            if (dayBirth > currentDay) {
                age--;
            }
        }
        return age;
    }
    
    public String getPartnerName() {
        if (partner == null) {
            return "";
        } else {
            return this.getPartner().getFullName();
        }
    }
    
    public boolean esteAdult()
    {
        return (2019-yearBirth >= 18);
    }
}