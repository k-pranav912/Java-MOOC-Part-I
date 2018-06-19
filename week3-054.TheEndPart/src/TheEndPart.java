import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a name: ");
        String name = reader.nextLine();
        
        System.out.print("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        int nameLength = name.length();
        
        System.out.println("Result: " + name.substring(nameLength - length , name.length()));
    }
}
