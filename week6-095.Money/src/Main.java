
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        Money a = new Money(10,0);
        Money b = new Money(5,10);
        
        Money c = a.minus(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
