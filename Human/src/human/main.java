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
public class main {
        public static void main(String[] args) {
        
        String firstName = "Maria";
        String lastName = "Popescu";
        char female = 'F';
        Human maria = new Human(firstName, lastName, female);
    
        maria.setBirthDate(1987,1,22); //Ianuarie 22, 1987
        System.out.println(maria.getFullName() + " are " + maria.getAge() + " ani");
        
        Human ion = new Human("Ion", "Melinte", 'M');
        ion.setBirthDate(1986,12,8); //Decembrie 08, 1986
        System.out.println(ion.getFullName() + " are " + ion.getAge() + " ani");
        maria.addPartner(ion);
        System.out.println(maria.getFullName() + "  are parinte  " + maria.getPartnerName());
        System.out.println(ion.getFullName() + "  are parinte " + ion.getPartnerName());
        System.out.println(ion.esteAdult());
    }
}
