/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Person {
    private String name;
    private Education education;

    public Person(String name, Education edu) {
        this.name = name;
        this.education = edu;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
