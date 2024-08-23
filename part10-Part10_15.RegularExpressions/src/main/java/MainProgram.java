

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        
        
        
        if(check.timeOfDay("20:00:00")){
            System.out.println("The form is correct");
        }else{
            System.out.println("The form is incorrect");
        }
    }
}
