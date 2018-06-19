
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.print("Type your name: ");
        String secondName = reader.nextLine();
        
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println(firstName + " and " + secondName + " are together " + (firstAge + secondAge) + " years old.");
        
    }
}
