/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chris
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readens;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readens = new ArrayList<>();
        
    }
    
    public void addSensor(Sensor toAdd){
        
        this.sensors.add(toAdd);
    }
    
    public boolean isOn(){
        
        for(Sensor x : this.sensors){
            if(!(x.isOn())){
                return false;
            }
        }
        return true;
    }
    public void setOn(){
        for(Sensor x : this.sensors){
            x.setOn();
        }
        
    }      
    public void setOff(){
        for(Sensor x : this.sensors){
            x.setOff();
        }
        
    }
    public int read(){
         if(!(this.isOn())){
             throw new IllegalStateException();
         }
         if(this.sensors.isEmpty()){
             throw new IllegalStateException();
         }
        int sum = this.sensors.stream().mapToInt(s -> s.read()).sum();
        
        int ave = sum/sensors.size();
        
        this.readens.add(ave);
        
        return ave;
        
    }
    public List<Integer> readings(){
        
        
        return this.readens;
    }
}   
