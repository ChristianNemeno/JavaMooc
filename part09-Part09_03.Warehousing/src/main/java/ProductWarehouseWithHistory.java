/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory change;
  
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
       super(productName,capacity);
       this.change = new ChangeHistory();
       super.addToWarehouse(initialBalance);
       this.change.add(initialBalance);
       
       
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.change.add(super.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount){
        double temp;
        if(super.getBalance() < amount){
           temp = super.getBalance();
           super.takeFromWarehouse(amount);
           this.change.add(super.getBalance());
           return temp;
        }
        super.takeFromWarehouse(amount);
        this.change.add(super.getBalance());
        
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+ super.getName());
        System.out.println("History: " + this.change.toString());
        System.out.println("Largest amount of product: " + this.change.maxValue());
        System.out.println("Smallest amount of product: " + this.change.minValue());
        System.out.println("Average: " + this.change.average());
    }
    
    
    public String history(){
        return this.change.toString();
    } 
    
    
}
