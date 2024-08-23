
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class OneItemBox extends Box {
    private ArrayList<Item> singleItem;

    public OneItemBox() {
        this.singleItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.singleItem.size() >= 1){
            return;
        }
        this.singleItem.add(item);
    }
    @Override
    public boolean isInBox(Item item){
        return this.singleItem.contains(item);
    }
    
    
    
}
