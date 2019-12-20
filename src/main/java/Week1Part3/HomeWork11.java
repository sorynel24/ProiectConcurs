package Week1Part3;

import  java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args){
        Scanner input_Int = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userNumber = input_Int.nextInt();

        if(userNumber > 0){
            System.out.println("The number is positive");
        }else if(userNumber < 0){
            System.out.println("The number is not positive");
        }else{
            System.out.println("0 is neutral");
        }
    }
}
