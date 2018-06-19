import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static double sum(ArrayList<Integer> list) {
        double i = 0;
        for (int number : list) {
            i += number;
        }
        return i;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list)*1.0 / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        ArrayList<Double> varSum = new ArrayList<Double>();
        double k = 0;
        double avg = average(list);
        for ( int i : list) {
            k = (i - avg)*(i- avg);
            varSum.add(k);
        }
        double var = 0;
        for ( double t : varSum) {
            var += t;
        }
        var = var/(varSum.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
