package Week1Part3;

import  java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args){
        Scanner input_Int = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userNum = input_Int.nextInt();

        if(userNum > 0){
            System.out.println("The number is positive");
        }else if(userNum < 0){
            System.out.println("The number is not positive");
        }else{
            System.out.println("0 is neutral");
        }
    }
}
