package Week1Part2;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args){
        Scanner inputWholeNumber = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int FirstNumber = inputWholeNumber.nextInt();
        System.out.print("Enter the second number: ");
        int SecondNumber = inputWholeNumber.nextInt();

        float result = (float) FirstNumber / SecondNumber;

        String resultNumber = String.format("%.1f", result);

        //Printing result of this two whole number

        System.out.printf("Division: %d / %d = %s", FirstNumber, SecondNumber, resultNumber);

    }
}
