package Week2;

import java.util.Scanner;

public class HangmanGameRunner {
    //The runner of hangman game

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HangmanGame hangmanGame = new HangmanGame();


        System.out.println("************");
        System.out.println("* Hangman *");
        System.out.println("************");
        System.out.println("");

        System.out.println("");
        // ADD YOUR IMPLEMENTATION HERE

        HangmanGame.printMenu();

        while (hangmanGame.GameOn()) {
            System.out.print("Type a command: ");
            String command = reader.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                System.out.print("Thank you for playing!");
                break;
            } else if (command.equalsIgnoreCase("status")) {
                hangmanGame.printStatus();
            }

            if(command.length() == 1){
                hangmanGame.guess(command);
                hangmanGame.printMan();
                hangmanGame.printWord();
            }else if(command.isEmpty()){
                System.out.println("String is empty");
            }else{
                System.out.println("You need one letter");
            }
        }
    }
}
