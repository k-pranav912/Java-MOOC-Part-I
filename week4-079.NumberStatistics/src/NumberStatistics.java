
public class NumberStatistics {
    private int amountOfNumbers;
    
    private int i = 0;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers += 1;
        i += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return i;
    }
    
    public double average() {
        if (this.amountOfNumbers > 0) {
        return 1.0*i/this.amountOfNumbers;
        } else {
            return 0;
        }
    }
}
