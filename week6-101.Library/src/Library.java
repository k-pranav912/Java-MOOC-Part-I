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

public class Library {
    private ArrayList<Book> library;
    
    public Library() {
        this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks() {
        for (Book k : this.library) {
            System.out.println(k);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book k : this.library) {
            if (StringUtils.included(k.title(), title)) {
                found.add(k);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book k : this.library) {
            if (StringUtils.included(k.publisher(), publisher)) {
                found.add(k);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book k : this.library) {
            if (k.year() == year) {
                found.add(k);
            }
        }
        return found;
    }
}
