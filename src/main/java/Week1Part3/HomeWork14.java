package Week1Part3;

import java.util.Scanner;

public class HomeWork14 {
    public static void main(String[] args){
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int firstNum = inputScan.nextInt();

        System.out.println("Type the second number: ");
        int secondNum = inputScan.nextInt();

        if(firstNum > secondNum){
            System.out.printf("Greater number: %d", firstNum);
            System.out.println();
        }else if(firstNum < secondNum){
            System.out.printf("Greater number: %d", secondNum);
            System.out.println();
        }else{
            System.out.println("The numbers are equals!");
        }
    }
}
