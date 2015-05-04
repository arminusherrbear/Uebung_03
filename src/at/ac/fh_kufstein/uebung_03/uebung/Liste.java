/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.uebung;


/**
 *
 * @author admin
 */
public class Liste {
 
    private int size;
    private Object[] elements;
    
    public Liste(int size){
        this.size = size;
        elements = new Object[size];
        
    }
    
    public void save(Object param){
        int length = elements.length;
        int i = 0;
        
        while(i<length){
            if(elements[i]==null){
             elements[i] = param;
            break;
            }
            i++;
        }
            
        
    }

    public Object[] getElements() {
        return elements;
    }
    
    
    
    

    
    
    
}
