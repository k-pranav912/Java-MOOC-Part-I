
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate first = new MyDate(25, 9 ,2001);
        MyDate second = new MyDate(23, 4, 2003);
        MyDate third = new MyDate(12, 4, 2004);
        
        System.out.println("first and second difference: " + second.differenceInYears(first));
        System.out.println("second and third difference: " + third.differenceInYears(second));
    }
}
