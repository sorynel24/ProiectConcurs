package Week1Part3;

import java.util.Scanner;

public class HomeWork15 {
    public static void main(String[] args){
        Scanner ageChecker = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = ageChecker.nextInt();

        if(age < 0 || age > 110){
            System.out.println("Impossible!");
        }else{
            System.out.println("OK");
        }
    }
}
