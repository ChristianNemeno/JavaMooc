
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        int total =0;
        this.items.add(item);
        for(Item x : this.items){
            total+=x.getWeight();
        }
        if(capacity < total){
            this.items.remove(this.items.size()-1);
        }
        
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}
