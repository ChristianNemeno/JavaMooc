/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    
    private final HashMap<LicensePlate , String> car;

    public VehicleRegistry() {
        this.car = new HashMap<>();
    }
    
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.car.containsKey(licensePlate)){
            return false;
        }
        
        this.car.put(licensePlate, owner);
        return true;
        
    }
    public String get(LicensePlate licensePlate){
        return this.car.getOrDefault(licensePlate, null);
    }
    public boolean remove(LicensePlate licensePlate){
        if(!this.car.containsKey(licensePlate)){
            return false;
        }
        this.car.remove(licensePlate);
        return true;
    }
    
    
    public void printLicensePlates(){
        for(LicensePlate x : car.keySet()){
            System.out.println(x);
        }
    }
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        
        for(String x : this.car.values()){
            if(names.contains(x)){
                continue;
            }else{
                names.add(x);
            }
        }
        for(String y : names){
            System.out.println(y);
        }
        
    }
    
    
}
