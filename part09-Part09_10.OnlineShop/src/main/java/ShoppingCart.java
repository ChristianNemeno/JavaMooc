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
import java.util.Map;
public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    public void add(String product, int price){
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        }else{
            this.cart.putIfAbsent(product, new Item(product,1,price));
        }
                        
    }
    public int price(){
       int totalPrice = 0;
       
       for(Item x : this.cart.values()){
           totalPrice += x.price();
       }
       return totalPrice;
    }
    public void print(){
        for(Item x : this.cart.values()){
            System.out.println(x);
        }
    }
    
    
}
