
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = 1;
        
        System.out.print("Upto what number: ");
        int entNumber = Integer.parseInt(reader.nextLine());
        
        while (number <= entNumber) {
            System.out.println(number);
            number++;
        }
        
    }
}
