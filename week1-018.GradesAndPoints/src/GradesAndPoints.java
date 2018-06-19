
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        String grade = null;
        
        if (points <= 29) {
            grade = "failed";
        } else if (30 <= points && points <= 34) {
            grade = "1";
        } else if (35 <= points && points <= 39) {
            grade = "2";
        } else if (40 <= points && points <= 44) {
            grade = "3";
        } else if (45 <= points && points <= 49) {
            grade = "4";
        } else if (50 <= points && points <= 60) {
            grade = "5";
        }
        
        System.out.println("Grade: " + grade);

    }
}
