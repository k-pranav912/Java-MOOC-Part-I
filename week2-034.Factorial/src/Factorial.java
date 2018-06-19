import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int factorial = 1;
        int i = 1;
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while (i <= number && number >= 0) {
            factorial = factorial*i;
            i++;
        }
        
        System.out.println("Fatorial is " + factorial);

    }
}
