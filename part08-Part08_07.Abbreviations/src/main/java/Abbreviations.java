import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
        
    }
    public void addAbbreviation(String abbreviation, String explanation){
        
        this.abbreviations.put(abbreviation,explanation);
    }
    
    public boolean  hasAbbreviation(String abbreviation){
        return this.abbreviations.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        if(!this.hasAbbreviation(abbreviation)){
            return null; 
        }
        return this.abbreviations.get(abbreviation);
    }
    public String StringSanitizer(String sad){
        if(sad == null){
            sad = "";
        }
        sad.toLowerCase();
        sad.trim();
        return sad;
    }
    
    
    
    
}
