
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> data = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(lines -> lines.trim())
                    .map(x -> x.split(","))
                    
                    
                    .map(parts -> new Literacy(parts[0],parts[1],parts[2].replace(" (%)", "").trim(),parts[3],Integer.parseInt(parts[4]), Double.parseDouble(parts[5]) ))
                    .forEach(objs -> data.add(objs));   
                        
                    }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                }
        data.stream().sorted((p1,p2) -> Double.compare(p1.getPercent(), p2.getPercent())).forEach(x -> System.out.println(x));
    }
}
