package Week1Part3;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args){
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = inputScan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = inputScan.nextInt();

        int TheBiggerNum = Math.max(firstNum, secondNum);

        System.out.println("The bigger number of this two integers is: " + TheBiggerNum);

    }
}
