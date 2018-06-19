
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int k : array) {
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
