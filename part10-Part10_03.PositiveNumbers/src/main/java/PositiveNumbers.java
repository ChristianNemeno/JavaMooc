    
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    numbers.add(i);
}

long howManyNumbers = numbers.stream()
    .filter(i -> i < 4)
    .map(i -> i * 2)
    .filter(i -> i > 10)
    .count();

System.out.println("Numbers: " + howManyNumbers);

    }
    public static List<Integer>positive(List<Integer> numbers){
        ArrayList<Integer> result = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return result;
    }

}
