package Week1Part3;

import java.util.Scanner;

public class HomeWork15B {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String failedGrade = "Failed";
        int Grade1 = 1;
        int Grade2 = 2;
        int Grade3 = 3;
        int Grade4 = 4;
        int Grade5 = 5;

        System.out.println("Type the points [0-60]");
        int num = keyboard.nextInt();

        if(num > 0 && num <= 29){
            System.out.println(failedGrade);
        }else if(num >= 30 && num <= 34){
            System.out.printf("Grade: %d", Grade1);
        }else if(num >= 35 && num <= 39){
            System.out.printf("Grade: %d", Grade2);
        }else if(num >= 40 && num <= 44){
            System.out.printf("Grade: %d", Grade3);
        }else if(num >= 45 && num <= 49){
            System.out.printf("Grade: %d", Grade4);
        }else if(num >= 50 && num <= 60){
            System.out.printf("Grade: %d", Grade5);
        }else{
            System.out.println("The number need to have in 0-60 range!!!!");
        }


    }

}
