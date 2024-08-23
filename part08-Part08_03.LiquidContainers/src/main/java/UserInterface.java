/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container first;
    private Container second;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.first = new Container();
        this.second = new Container();
    }
    
    public void start(){
        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+first.toString());
            System.out.println("Second: "+second.toString());
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] values = input.split(" ");
            String command = values[0]; 
            int amount = Integer.parseInt(values[1]);
                
            if(command.equals("add")){
                first.add(amount);
            }else if(command.equals("move")){
                
                if(amount > first.getAmount()){                  
                  int complement = amount - first.getAmount();
                  int amountz = amount - complement;
                  first.remove(amount);
                  second.add(amountz);
                }else{
                  first.remove(amount);
                  second.add(amount);
                }
                
            }else if(command.equals("remove")){
                second.remove(amount);
            }    
        }
        
    }
    
    
}
