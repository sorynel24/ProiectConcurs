package Week2;


import java.util.Scanner;
import java.util.Random;

public class GuessTheSecretNumberGame {
    //Exercises 17 from week 2
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        Random randomNum = new Random();

        int SecretNumber = 1 + randomNum.nextInt(100);
        int NumberOfAttempts = 20;
        int guessesMade = 0;

        while(NumberOfAttempts > 0){
            System.out.print("Guess the number: ");
            int inputNumber = inputScanner.nextInt();
            if(inputNumber > SecretNumber){
                NumberOfAttempts--;
                guessesMade++;
                System.out.println("The number is lesser, guesses made: " + guessesMade);
            }else if(inputNumber < SecretNumber){
                NumberOfAttempts--;
                guessesMade++;
                System.out.println("The number is greater, guesses made: " + guessesMade);
            }else{
                System.out.println("Congratulations, your guess is correct!");
                break;
            }

            if(NumberOfAttempts == 0){
                System.out.println("You lose!");
            }
        }
    }
}
