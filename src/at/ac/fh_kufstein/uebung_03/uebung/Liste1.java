/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.uebung;


import at.ac.fh_kufstein.uebung_03.Classes.Boat;
import at.ac.fh_kufstein.uebung_03.Classes.Car;
import at.ac.fh_kufstein.uebung_03.Classes.Vehicle;

/**
 *
 * @author admin
 * @param <T>
 * @param 
 */
public class Liste1<T extends BenennbarClass>{
    
    
    private int size;
    private T[] elements;
    
    public Liste1(int size){
        this.size = size;
        elements = (T[]) new BenennbarClass[size];
        
    }
    
    public void save(T param){
        int length = elements.length;
        int i = 0;
        
        while(i<length){
            if(elements[i]==null){
                
             elements[i] = (T) param;
            break;
            }
            i++;
        }
            
        
    }

    public T[] getElements() {
        return elements;
    }
}
