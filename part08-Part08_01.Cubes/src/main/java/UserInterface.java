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
    //private Cube cube;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        //this.cube = cube;
    }
    public void start(){
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int num = Integer.parseInt(input);
            System.out.println(new Cube(num).cubed());
        }
    }
    
    
}
