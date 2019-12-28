package Week2;

import java.util.Scanner;

import java.util.Scanner;

public class LoopsEndingAndRememberingPart4 {
    //Part4 of Exercises 12 to Week 2
    public static void main(String[] args){
        Scanner myScan  = new Scanner(System.in);
        int Num;
        int NumbersCounter = 0;
        int Sum = 0;

        while(true){
            System.out.println("Type numbers: ");
            Num = Integer.parseInt(myScan.nextLine());
            if(Num < 0 || Num == 0){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + Sum);
                System.out.println("How many numbers: " +NumbersCounter);
                //Media numerelor
                float Average = (float) Sum / NumbersCounter;
                System.out.println("Average: " + Average);
                break;
            }else{
                NumbersCounter++;
                System.out.println(Num);
                Sum += Num;
            }
        }
    }
}
