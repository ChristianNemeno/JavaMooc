/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */


public class Item {
    private String product;
    private int qty; 
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Item(String product, int unitPrice) {
        this.product = product;
        this.qty = 0;
        this.unitPrice = unitPrice;
    }

    public int price(){
        if(this.qty == 0 ){
            return this.unitPrice;
        }
        return this.unitPrice * this.qty;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public String toString(){
        return this.product + ": " + this.qty; 
    }
}   
