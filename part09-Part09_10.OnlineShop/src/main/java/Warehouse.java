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
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
public class Warehouse {

    
    private Map<String,Integer> quantities;
    private Map<String,Integer> productStock;
    
    public Warehouse() {
        this.quantities = new HashMap<>();
        this.productStock = new HashMap<>();
        
    }
    public void addProduct(String product, int price, int stock){
        this.quantities.put(product, price);
        this.productStock.put(product, stock);      
    }
    public int price(String product){
        return this.quantities.getOrDefault(product, -99);
        
        
    }
    
    public int stock(String product){
        return this.productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
    Integer temp = this.productStock.get(product);
    
    if (temp == null || temp <= 0) {
        return false;
    }
    
    this.productStock.put(product, temp - 1);
    return true;
}
    
    public Set<String> products(){
        Set<String> names = new HashSet<>();
        
        for(String x : this.quantities.keySet()){
            names.add(x);
        }
        return names;
    }
    
    
}
