import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade grades = new Grade();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        System.out.println("Type exam scores, -1 completes");
        grades.Grade(reader);
        
        System.out.println("");
        System.out.println("Grade Distribution: ");
        grades.gradeStars();
        System.out.print("Acceptance percentage: ");
        System.out.println(grades.acceptancePercentage());
        
    }
}
