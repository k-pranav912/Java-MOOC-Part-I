import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        /*int sum = 0;
        int i = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Type numbers: ");
        
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum = sum + number;
            i++;
            if (number == -1) {
                break;
            }
        }
        
        double average = 1.0*(sum + 1) / (i - 1);
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (sum + 1) );
        System.out.println("How many numbers: " + (i - 1));
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (odd -1));
        */

        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Type numbers: ");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            
            sum += number;
            numbers++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        double average = (double) sum / numbers;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
