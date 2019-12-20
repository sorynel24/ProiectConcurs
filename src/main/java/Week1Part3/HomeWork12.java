package Week1Part3;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You have reached the age of majority!");
        }else{
            System.out.println("You have not reached the age of majority yet!");
        }

    }
}
