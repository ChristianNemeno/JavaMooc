import java.util.Scanner;

public class UserInterface {
    private TodoList work;
    private Scanner scanner;

    public UserInterface(TodoList work, Scanner scanner) {
        this.work = work; 
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.endsWith("add")){
                System.out.print("To add: ");
                String todo = scanner.nextLine();
                this.work.add(todo);
            }else if(input.equals("list")){
                this.work.print();
            }else if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                this.work.remove(index);
            }
            
        }
        
    }
    
    
    
}
