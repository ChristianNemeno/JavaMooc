
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
           String input = scanner.nextLine();
           if(input.equals("end")){
               break;
           }
           numbers.add(Integer.valueOf(input));
           
        }
        System.out.println("Print the average of the negative or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        
        if(answer.equals("n")){
            double negative = numbers.stream()
                              .mapToInt(s -> Integer.valueOf(s))
                              .filter(number -> number < 0)
                              .average()
                              .getAsDouble();
            System.out.println("Average of negative numbers: "+negative);           
        }else{
            double positive = numbers.stream()
                              .mapToInt(s -> Integer.valueOf(s))
                              .filter(number -> number > 0)
                              .average()
                              .getAsDouble();
            System.out.println("Average of positive numbers: "+positive);
        }
    }
}
