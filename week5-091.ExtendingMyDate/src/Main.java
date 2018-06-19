
public class Main {

    public static void main(String[] args) {
        // test your code here
        MyDate p1 = new MyDate(25, 2, 2011);
        
        MyDate newDate = p1.afterNumberOfDays(7);
        
        for (int i = 1; i <= 7; i++) {
            System.out.println("Friday after " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        
        System.out.println("This week's Friday is " + p1);
        System.out.println("The date 790 days from this week's Friday is " + p1.afterNumberOfDays(790));
    }
}
