import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    @Override
    public String toString(){
        return this.history.toString();
    }
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double max = this.history.get(0);
        for(double x : this.history){
            if(x > max){
                max = x;
            }
        }
        return max;
    }
    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double min = this.history.get(0);
        for(double x : this.history){
            if(x < min){
                min = x;
            }
        }
        return min;
    }
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        int sum =0; 
        for(double x : this.history){
            sum += x;
        }
        double average = sum /(double)this.history.size();
        return average;
    }
    
    
}
