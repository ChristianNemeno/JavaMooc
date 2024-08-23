import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> peeps;

    public Employees() {
        this.peeps = new ArrayList<>();
    }
    public void add(Person personToAdd){
        peeps.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        while(iterator.hasNext()){
            Person addAnother = iterator.next();
            peeps.add(addAnother);
        }
    }
    public void print(){
        Iterator<Person> iterator = peeps.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = peeps.iterator();

        while(iterator.hasNext()){
            Person temp = iterator.next();
            if(temp.getEducation() == education){

                System.out.println(temp);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = peeps.iterator();

        while(iterator.hasNext()){
            if(iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }

}
