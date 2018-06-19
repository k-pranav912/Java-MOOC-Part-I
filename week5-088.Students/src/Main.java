
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            
            if (name.length() == 0) {
                break;
            }
            
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));
            
        }
        
        System.out.println("");
        
        for (Student k : list) {
            System.out.println(k);
        }
        
        System.out.println("");
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        
        for (Student k : list) {
            if (k.getName().contains(searchTerm)) {
                System.out.println(k);
            }
        }
    }
}
