/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03;

import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import static at.ac.fh_kufstein.uebung_03.Classes.Color.*;

/**
 *
 * @author admin
 */
public class Aufruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car bmw = new Car((short)4, (short)4, silver, (short)200, (short) 5);
        Car audi = new Car((short)8, (short)4, silver, (short)180, (short) 5);
        Boat titanic = new Boat(10.54, (short)3, 100000, (short)0, blue, (short) 51000, (short)0);
        
        
        System.out.println(bmw);
        System.out.println(audi);
        System.out.println(titanic);
        
        Benennbar namedCar = new Car((short)4, (short)4, silver, (short)200, (short) 5);
        namedCar.setName("Audi");
        System.out.println(namedCar.getName());
        
    }
    
}
