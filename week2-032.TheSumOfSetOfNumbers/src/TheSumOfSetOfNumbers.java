
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        
        System.out.print("Until what? ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (number <= limit) {
            sum = sum + number;
            number++;
        }
        
        System.out.println("Sum is " + sum);

    }
}
