package Week1Part3;
;
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class HomeWork20 {
    public static void main(String[] args){
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("The statistics service");
        while(true){
            System.out.println("Type a command(points, penalties, goals, assists, player, club, quit):");
            String command = inputKeyboard.nextLine();

            if(command.equalsIgnoreCase("quit")){
                break;
            }

            if(command.equalsIgnoreCase("points")){
                NHLStatistics.sortByPoints();
                System.out.print("Tell me the number of the top players you want to be print: ");
                int TopStatistics = inputKeyboard.nextInt();
                NHLStatistics.top(TopStatistics);
            }else if(command.equalsIgnoreCase("goals")){
                NHLStatistics.sortByGoals();
                System.out.print("Tell me the number of the top players you want to be print: ");
                int TopStatistics = inputKeyboard.nextInt();
                NHLStatistics.top(TopStatistics);
            }else if(command.equalsIgnoreCase("penalties")){
                NHLStatistics.sortByPenalties();
                System.out.print("Tell me the number of the top players you want to be print: ");
                int TopStatistics = Integer.parseInt(inputKeyboard.next());
                NHLStatistics.top(TopStatistics);
            }else if(command.equalsIgnoreCase("assists")){
                NHLStatistics.sortByAssists();
                System.out.print("Tell me the number of the top players you want to be print: ");
                int TopStatistics = inputKeyboard.nextInt();
                NHLStatistics.top(TopStatistics);
            }else if(command.equalsIgnoreCase("player")){
                System.out.print("Which player: ");
                String player = inputKeyboard.nextLine();
                NHLStatistics.searchByPlayer(player);
            }else if(command.equalsIgnoreCase("club")){
                System.out.print("Which club: ");
                String club = inputKeyboard.nextLine();
                NHLStatistics.teamStatistics(club);
            }else{
                System.out.println("This word has been rejected");
            }
        }
    }
}
