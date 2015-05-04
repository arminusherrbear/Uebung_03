/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

/**
 *
 * @author admin
 */
public class Boat extends Vehicle {
    
    private double draft;
    private short propeller;
    private double cargo;

    public Boat(double draft, short propeller, double cargo, short wheels, Color farbe, short ps, short doors) {
        super(wheels, farbe, ps, doors);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }
    
    public void unload(){
        this.cargo = 0;
        try{
        Thread.sleep(5000);
        }
        catch(Exception e){
            
        }
    }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+getPs()+ " und hat einen Tiefgang von "+ getDraft(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
