
public class Book {
   private String name;
   private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "(recommended for "+ this.age+" year-olds or older)"; //To change body of generated methods, choose Tools | Templates.
    }
    
   
   
   
}
