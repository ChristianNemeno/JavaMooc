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

public class Herd implements Movable {
     private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }
    @Override
    
    public String toString(){
        String result = "";
        for(Movable x : this.herd){
            result += x.toString() + "\n";
        }
        return result;
    }
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable x : this.herd){
            x.move(dx,dy);
        }
    }
    
     
}
