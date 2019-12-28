package Week2;

import java.util.Scanner;

public class SetNumbersSum {
    // Exercises 8 to Week 2
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int Counter = 0;
        int sum = 0;
        System.out.print("Until what?");
        int number = Integer.parseInt(reader.nextLine());

        while(Counter < number){
            Counter++;
            sum += Counter;
        }

        System.out.println("The sum is: " + sum);

    }
}
