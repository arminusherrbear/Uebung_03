/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.uebung;

import at.ac.fh_kufstein.uebung_03.Classes.Car;
import static at.ac.fh_kufstein.uebung_03.Classes.Color.*;

/**
 *
 * @author admin
 */
public class Aufruf {
    
    public static void main(String[]args){
        
    BenennbarClass namedCar = new Car1((short)8, (short)4, silver, (short)180, (short) 5);
    namedCar.setName("audi");
    
        System.out.println(namedCar.getName());
  
       
      Liste li = new Liste(2);
      li.save(2.0);
      li.save(5.0);
      li.save(200.0);
      
      for(int i =0; i<li.getElements().length;i++){
          System.out.println(li.getElements()[i]);
      }
      
      Car1 audi = new Car1((short)8, (short)4, silver, (short)180, (short) 5);
      Car1 bmw = new Car1((short)4, (short)4, black, (short)200, (short) 5);
      
      Liste1 li1 = new Liste1(2);
      li1.save(audi);
      li1.save(bmw);
      
      for(int i= 0; i<li1.getElements().length;i++){
        System.out.println(li1.getElements()[i]);
      }
      
    }
    
}
