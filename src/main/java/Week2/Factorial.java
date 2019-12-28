package Week2;

import java.util.Scanner;

public class Factorial {
    //Exercises 10 to Week 2
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        int counter = 1;
        int factorial = 1;

        System.out.print("Type a number: ");
        num = Integer.parseInt(input.nextLine());

        while(counter <= num){
            factorial *= counter;
            if(counter == num){
                break;
            }
            counter++;
        }

        System.out.printf("Factorial is %d", factorial);

    }
}
