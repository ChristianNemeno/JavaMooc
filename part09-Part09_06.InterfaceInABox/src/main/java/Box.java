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
public class Box implements Packable{
    private ArrayList<Packable> packs; 
    private double maxCapacity;

    public Box(double maximumCapacity) {
        this.packs = new ArrayList<>();
        this.maxCapacity = maximumCapacity;
    }

    public ArrayList<Packable> getPacks() {
        return packs;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }
    
    public void add(Packable addable){
        this.packs.add(addable);
        if(checkCapacity()){
           this.packs.remove(this.packs.size()-1);
        }
    }
    public boolean checkCapacity(){
        if(this.weight() > this.maxCapacity){
            return true;
        }else{
            return false;
        }
    }
    
    public double weight(){
        if(this.packs.isEmpty()){
            return 0;
        }
        double total = 0;
        for(Packable x : this.packs){
            total += x.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + this.packs.size() + " items, total weight " + this.weight() + " kg"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
