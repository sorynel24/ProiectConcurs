package Week1Part3;

import nhlstats.NHLStatistics;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println();
        System.out.println();

        System.out.println("Top twenty-five players by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println();
        System.out.println();

        System.out.println("Sydney Crosby statistics");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println();
        System.out.println();

        System.out.println("Philadelphia Flyers statistics");
        NHLStatistics.teamStatistics("PHI");

        System.out.println();
        System.out.println();

        System.out.println("Anaheim Ducks statistics by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
