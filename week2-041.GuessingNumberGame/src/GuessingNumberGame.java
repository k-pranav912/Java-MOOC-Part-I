
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        
        System.out.print("Guess a number: ");
        int numberGuess = Integer.parseInt(reader.nextLine());
        int i = 0;
        
        /*if (numberGuess == numberDrawn) {
            System.out.println("Congratulations, your guess is correct!");
        }*/
        
        while (true) {
            i++;
            if (numberGuess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            if (numberGuess < numberDrawn) {
                System.out.print("The number is greater, ");
            } else if (numberGuess > numberDrawn) {
                System.out.print("The number is lesser, ");
            }
            System.out.println("guesses made: " + i);
            System.out.print("Guess a number: ");
            numberGuess = Integer.parseInt(reader.nextLine());
            
            /*if ( numberGuess == numberDrawn) {
                System.out.print("Congratulations, your guess is correct!");
                break;
            }*/
        } 
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
