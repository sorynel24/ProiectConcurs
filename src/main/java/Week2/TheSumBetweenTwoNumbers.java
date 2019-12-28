package Week2;

import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    //Exercises 9 to Week 2
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int LowerLimit;
        int UpperLimit;
        int sum = 0;

        System.out.print("First: ");
        LowerLimit = Integer.parseInt(inputScanner.nextLine());
        System.out.print("Last: ");
        UpperLimit = Integer.parseInt(inputScanner.nextLine());

        while(LowerLimit <= UpperLimit){
            sum += LowerLimit;
            LowerLimit++;
        }

        System.out.printf("The sum is %d", sum);
    }
    }
