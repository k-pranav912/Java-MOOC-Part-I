

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        
    }
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        int k = 0;
        for (int i : array) {
            copy[k] = i;
            k++;
        }
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseCopy[k] = array[i];
            k++;
        }
        return reverseCopy;
    }
    
}
