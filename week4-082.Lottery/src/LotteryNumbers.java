import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int maxLength = 7;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i<this.maxLength) {
            int drawNumber = this.random.nextInt(39) + 1;
            if (!containsNumber(drawNumber)) {
                this.numbers.add(drawNumber);
                i++;
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
