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

public class BirdDatabase {
    private Bird bird;
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
    }
    
    public void addBird(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public void observation(String birdName) {
        for (Bird k : birds) {
            if (k.name.equals(birdName)) {
                k.addObservation();
            } else {
                System.out.println("Is not a bird!");
            }
        }
    }
    
    public void printStatistics() {
        for (Bird k : birds) {
            System.out.println(k);
        }
    }
    
    public void printBird(String birdName) {
        for (Bird k : birds) {
            if (k.name.equals(birdName)) {
                System.out.println(k);
                break;
            }
        }    
    }
    
}
