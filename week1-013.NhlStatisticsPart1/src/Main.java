
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        System.out.println("Top twenty-five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        System.out.println("Statistics of Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("");
        System.out.println("Statistics of Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
    }
}
