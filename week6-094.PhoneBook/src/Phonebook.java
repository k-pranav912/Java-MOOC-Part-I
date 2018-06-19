/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;
    
    public Phonebook() {
        this.phonebook = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person p1 = new Person(name, number);
        this.phonebook.add(p1);
    }
    
    public void printAll() {
        for (Person i : this.phonebook) {
            System.out.println(i);
        }
    }
    
    public String searchNumber(String name) {
        String k ="";
        for (Person i : this.phonebook) {
            if (i.getName().equals(name)) {
                k = i.getNumber();
                break;
            } else {
                k = "number not known";
            }
        }
        return k;
    }
}
