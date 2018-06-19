/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class Bird {
    String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }
    public String getName() {
        return this.name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int addObservation() {
        return this.observation++;
    }
    
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observation + " observations";
     }
}
