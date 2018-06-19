
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        System.out.print("Second: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }

    }
}
