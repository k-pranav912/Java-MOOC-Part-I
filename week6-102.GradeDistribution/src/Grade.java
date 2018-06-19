/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
import java.util.Scanner;

public class Grade {
    private String grade0 = "";
    private String grade1 = "";
    private String grade2 = "";
    private String grade3 = "";
    private String grade4 = "";
    private String grade5 = "";
    
    private Scanner reader;
    
    public void Grade(Scanner reader) {
        while (true) {
            int points = Integer.parseInt(reader.nextLine());
            if (points == -1) {
                break;
            } else if (0 <= points && points <= 29) {
                grade0 += "*";
            } else if (30 <= points && points <= 34) {
                grade1 += "*";
            } else if (35 <= points && points <= 39) {
                grade2 += "*";
            } else if (40 <= points && points <= 44) {
                grade3 += "*";
            } else if (45 <= points && points <= 49) {
                grade4 += "*";
            } else if (50 <= points && points <= 60) {
                grade5 += "*";
            }
        }
    }
    
    public void gradeStars() {
        System.out.println("Grade Distribution: ");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }
    
    public int totalGrades() {
        return grade0.length() + grade1.length() + grade2.length() + grade3.length() + grade4.length() + grade5.length();
    }
    
    public int acceptedGrades() {
        return grade1.length() + grade2.length() + grade3.length() + grade4.length() + grade5.length();
    }
    
    public double acceptancePercentage() {
        return 100.00*acceptedGrades()/totalGrades();
    }
    
}
