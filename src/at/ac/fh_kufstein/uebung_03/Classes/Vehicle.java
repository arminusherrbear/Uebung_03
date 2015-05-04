/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.ac.fh_kufstein.uebung_03.Classes;

import at.ac.fh_kufstein.uebung_03.Benennbar;

/**
 *
 * @author admin
 */
public class Vehicle implements Benennbar{
    
    private short wheels;
    private Color farbe;
    private short ps; 
    private short doors;
    private boolean started;
    private short speed;

    public Vehicle(short wheels, Color farbe, short ps, short doors) {
        this.wheels = wheels;
        this.farbe = farbe;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
    }

    
    protected String FName;
    public String getName(){
     return FName;
    }
    
    public void setName(String n){
        FName = n;
    }
    
    
    
    
    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    
    
    
    
    
    public void start(){
        this.started = true;
    }
    
    public void stop(){
        this.started = false;
    }
    
    public void accelerate(short speed){
        if(started == true){
            this.speed += speed;
            if(this.speed >= 250){
                this.speed = 250;
            }
        }
    }
    
    public void breeak(short speed){
         if(started == true){
            this.speed -= speed;
            if(this.speed < 0){
                this.speed = 0;
            }
        }
    }
    
}
