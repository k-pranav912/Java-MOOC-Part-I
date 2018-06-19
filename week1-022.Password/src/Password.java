
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String entPassword = reader.nextLine();
            if (entPassword.equals(password)) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println("THe secret is: jryy qbar");
                break;
            } else System.out.println("Wrong!");
        }
        
    }
}
