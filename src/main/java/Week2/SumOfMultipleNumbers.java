package Week2;

import java.util.Scanner;

public class SumOfMultipleNumbers {
    //Exercises 2 of Week 2
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number: ");
            int read = Integer.parseInt(reader.nextLine());

            if(read == 0){
                break;
            }
            sum = sum + read;

            System.out.println("sum now: " + sum);
        }

        System.out.println("Sum in the end : " + sum);

    }
}
