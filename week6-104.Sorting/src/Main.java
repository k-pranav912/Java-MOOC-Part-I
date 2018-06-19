import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] array = {-22, 3, 4, -1, 2};
        System.out.println(smallest(array));
        System.out.println(indexOfTheSmallest(array));
        System.out.println(indexOfTheSmallestStartingFrom(array, 2));
        System.out.println(Arrays.toString(array));
        swap(array, 0, 1);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static int smallest(int[] array) {
        int k = array[0];
        for (int i : array) {
            if (i < k) {
                k = i;
            }
        }
        return k;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int k = -1;
        int i = smallest(array);
        for (int j : array) {
            k++;
            if (j == i) {
                break;
            }
        }
        return k;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int i = array[index];
        int j = index - 1;
        for (int k = index; k < array.length; k++) {
            if (i > array[k]) {
                i = array[k];
            }
        }
        for (int k = index; k < array.length; k++) {
            j++;
            if (array[k] == i) {
                break;
            }
        }
        return j;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int i = array[index1];
        int j = array[index2];
        
        array[index1] = j;
        array[index2] = i;
    }
    
    public static void sort(int[] array) {
        for (int k = 0; k < array.length; k++) {
            swap(array, k, indexOfTheSmallestStartingFrom(array, k));
        }
    }

}
