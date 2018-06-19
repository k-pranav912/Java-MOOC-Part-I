
public class Main {

    public static void main(String[] args) {
        // write here test code
        
        Reformatory pranavReformatory = new Reformatory();
        
        Person brian = new Person("Brian", 44, 168, 60);
        
        System.out.println("Total weights measured: " + pranavReformatory.totalWeightsMeasured());
        
        System.out.println(brian.getName() + " weight: " + pranavReformatory.weight(brian) + " kilos");
        
        System.out.println("Total weights measured: " + pranavReformatory.totalWeightsMeasured());
        
        pranavReformatory.feed(brian);
        
        System.out.println(brian.getName() + " weight: " + pranavReformatory.weight(brian) + " kilos");
        
        System.out.println("Total weights measured: " + pranavReformatory.totalWeightsMeasured());
        
        
    }
}
