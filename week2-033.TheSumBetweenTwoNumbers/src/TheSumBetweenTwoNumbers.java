
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (firstNumber <= secondNumber) {
            sum = sum + firstNumber;
            firstNumber++;
        }
        
        System.out.println("The sum: " + sum);
        
    }
}
