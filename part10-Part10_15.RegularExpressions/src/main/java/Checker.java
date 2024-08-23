

public class Checker {

    
    public boolean isDayOfWeek(String string){
        if(string.matches("tue|mon|wed|thu|fri|sat|sun")){
            return true;
        }else{
            return false;
        }
    }
    public boolean allVowels(String string){
       if(string.matches("^[aieou]+$")){
           return true;
       }else{
           return false;
       }
    }
    public boolean timeOfDay(String string){
        if(string.matches("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$")){
            return true;
        }else{
            return false;
        }
    }
    
}
