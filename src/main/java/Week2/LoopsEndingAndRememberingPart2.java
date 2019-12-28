package Week2;

import java.util.Scanner;

public class LoopsEndingAndRememberingPart2 {
    //Part 2 of Exercises 12 to Week2
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int MyInt;
        int sum = 0;

        while(true){
            System.out.println("Type numbers: ");
            MyInt = Integer.parseInt(keyboard.nextLine());
            if(MyInt < 0){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is "  + sum);
                break;
            }
            sum += MyInt;
        }



    }
}
