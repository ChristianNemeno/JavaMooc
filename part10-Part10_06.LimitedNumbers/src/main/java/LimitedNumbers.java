
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        
        while(true){
            int input = scanner.nextInt();
            if(input < 0){
                break;
            }
            nums.add(input);
            
        }
        
        nums.stream()
            .filter(value -> value >= 1 && value <=5)
                .forEach(value -> System.out.println(value));
    }
}
