
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the temperature: ");
            double temperature = Double.parseDouble(reader.nextLine());
            
            if ((temperature >= -30.0) && (temperature <= 40.0))
                Graph.addNumber(temperature);
        }

        // Graph is used as follows:
        /*Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        */
        // Remove or comment out these lines above before trying to run the tests.
    }
}
