
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for ( String i : meals) {
            System.out.println(i);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
