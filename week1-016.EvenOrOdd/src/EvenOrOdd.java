
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if ( number % 2 == 0) {
            
            System.out.println("Number " + number + " is an even number.");
            
        } else {
            
            System.out.println("Number " + number + " is an odd number.");
        }

    }
}
