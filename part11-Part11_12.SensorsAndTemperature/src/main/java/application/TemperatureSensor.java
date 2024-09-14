/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author chris
 */
public class TemperatureSensor implements Sensor{
    
    private boolean status; 
    private int n;

    public TemperatureSensor() {
        this.status = false;
        
    }

    public boolean isOn(){
        return this.status;
    }
    public void setOn(){
        this.status = true;
    }      
    public void setOff(){
        this.status = false;
    }
    public int read(){
        if(this.status){
            this.n = new Random().nextInt(61) - 30;
            return n;
        }else{
             throw new IllegalStateException();
        }
        
    }
}
