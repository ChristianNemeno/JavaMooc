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

public class IOU {
    private HashMap<String, Double> record;

    public IOU() {
        this.record = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        if(!record.containsKey(toWhom)){
            record.put(toWhom, amount);
        }
        
    }
    public double howMuchDoIOweTo(String toWhom){
        
        return record.getOrDefault(toWhom, 0.0);
    }
    
    
}
