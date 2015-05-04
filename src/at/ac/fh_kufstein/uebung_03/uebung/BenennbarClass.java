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
public abstract class BenennbarClass {
 
    
    protected String FName;
    
    void setName(String n){
        FName = n;
    }
    
    String getName(){
        return FName;
    }
    
}
