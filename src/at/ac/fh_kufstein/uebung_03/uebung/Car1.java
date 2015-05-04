/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.uebung;

import at.ac.fh_kufstein.uebung_03.Classes.Color;

public class Car1 extends Vehicle1{

  private boolean aircondition;
    private short airbag;

    public Car1(short airbag, short wheels, Color farbe, short ps, short doors) {
        super(wheels, farbe, ps, doors);
        this.aircondition = false;
        this.airbag = airbag;
    }
    
    public void startAircondition(){
        if(aircondition == false){
            this.aircondition = true;
        }
        else System.out.println("Klimaanlage läuft bereits");
    }
    
    public void stopAircondition(){
        if(aircondition == true){
            this.aircondition = false;
        }
        else System.out.println("Klimaanlage ist bereits ausgeschaltet");
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+getPs()+ " und fährt mit "+getSpeed(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}