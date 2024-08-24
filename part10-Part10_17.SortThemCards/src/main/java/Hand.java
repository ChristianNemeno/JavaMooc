/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    public int sum(){
        int summa =0;
        for(Card x : cards){
            summa += x.getValue();
        }
        return summa;
    }
    public int compareTo(Hand hando){
        return sum() - hando.sum();
    }
    
        public void add(Card card){
        this.cards.add(card);
    } 
    public void print(){
        for(Card x : this.cards){
            System.out.println(x);
        }
    } 
    
    public void sort(){
        Collections.sort(cards);
    }
    public void sortBySuit(){
        Collections.sort(cards,new BySuitInValueOrder());
    }
    
        
}
