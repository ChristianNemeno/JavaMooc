/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.HashMap;
public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>(); 
    }
    public void add(String unit, String item){
        
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        this.storage.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.storage.get(storageUnit) == null){
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }
    
    
    public void remove(String storageUnit, String item){
        ArrayList<String> helper = this.storage.get(storageUnit);
        for(String x : helper){
            if(x.equals(item)){
                helper.remove(x);
                if(helper.isEmpty()){
                    this.storage.remove(storageUnit);
                }
                break;
            }
        }
        
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        
        for(String x : this.storage.keySet()){
            units.add(x);
        }
        return units;
    }
    

    
}
