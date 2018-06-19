
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        String h = "";
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                h += array[i];
            } else {
                h += array[i] + ", ";
            }
        }
        System.out.println(h);
    }
}
