
public class Least {

    public static int least(int number1, int number2) {
        int least = 0;
        if (number1 < number2) {
            least = number1;
        } else if (number1 > number2) {
            least = number2;
        } else if (number1 == number2) {
            least = number1;
        }
        return least;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
