
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = scanner.nextInt();
            String buffer = scanner.nextLine();
            books.add(new Book(input, age));
            
        }
        System.out.println(books.size()+" books in total.");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator.comparing(Book:: getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for(Book x : books){
            System.out.println(x);
        }
        
    }

}
