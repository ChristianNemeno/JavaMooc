/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;


public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }
    
    
    
    public void add(String word, String translation){
        
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.dictionary.get(word) == null){
            return new ArrayList<>();
        }
        
        return this.dictionary.get(word);
    }
    public void remove(String word){
        this.dictionary.remove(word);   
    }
}
