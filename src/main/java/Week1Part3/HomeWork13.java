package Week1Part3;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner readerInt = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = readerInt.nextInt();

        if(number % 2 == 0){
            System.out.println("Number " + number + " is even");
        }else{
            System.out.println("Number " + number + " is odd");
        }
    }
}
