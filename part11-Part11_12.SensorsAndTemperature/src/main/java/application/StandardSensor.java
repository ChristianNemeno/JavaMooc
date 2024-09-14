/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author chris
 */
public class StandardSensor implements Sensor{
    private int n;
    

    public StandardSensor(int n) {
        this.n = n;
    }
 
    public boolean isOn(){
        return true;
    }
    public void setOn(){
        
    }      
    public void setOff(){
        
    }
    public int read(){
        
        return this.n;
    }
}
