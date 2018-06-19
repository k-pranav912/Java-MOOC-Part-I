/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next() {
        if (value >= upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }
    
    public String toString() {
        if (this.value < 10) {
        return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int k) {
        if ( k >= 0 && k <= this.upperLimit) {
        this.value = k;
        }
    }
    
}
