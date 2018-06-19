
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        
        while (i <= limit) {
            int powerNumber = (int)Math.pow(2, i);
            sum = sum + powerNumber;
            i++;
            
        }
        
        System.out.println("The result is " + sum);

    }
}
