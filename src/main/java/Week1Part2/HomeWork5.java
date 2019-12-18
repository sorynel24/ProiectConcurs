package Week1Part2;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args){
        Scanner readerScanner = new Scanner(System.in);

        System.out.print("Type a number : ");
        int FirstNumber = Integer.parseInt(readerScanner.nextLine());

        System.out.print("Type another number: ");
        int SecondNumber = Integer.parseInt(readerScanner.nextLine());

        System.out.println("The sum of this numbers is " + (FirstNumber + SecondNumber));
    }
}
