/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class Counter {
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }
    
    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }
    
    public int value() {
        return this.startingValue;
    }
    
    public void increase(int k) {
        if (k >= 0) {
            this.startingValue += k;
        }
    }
    
    public void increase() {
        this.startingValue++;
    }
    
    public void decrease(int k){
        if (this.check == false && k >= 0) {
            this.startingValue -= k;
        } else if (this.startingValue >= k && k >= 0) {
            this.startingValue -= k;
        } else if (this.startingValue < k) {
            this.startingValue = 0;
        }
    }
    
    public void decrease() {
        if (this.check == false) {
            this.startingValue--;
        } else if (this.startingValue > 0) {
            this.startingValue--;
        }
    }
    
}
