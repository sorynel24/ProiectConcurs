package Week1Part3;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int InputNum = inputScanner.nextInt();

        double Cercle_circumference = Math.PI * 2 * InputNum;

        System.out.println("The circle circumference is " + Cercle_circumference);
    }
}
