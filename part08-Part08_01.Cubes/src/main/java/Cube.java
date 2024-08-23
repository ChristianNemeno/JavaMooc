
public class Cube {
    private int number;

    public Cube(int num) {
        this.number = num;
    }
    
    public int cubed(){
        return this.number * this.number * this.number; 
    }
    public String toString(){
        return ""+this.number;
    }
    
}
