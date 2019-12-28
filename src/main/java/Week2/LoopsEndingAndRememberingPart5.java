package Week2;

import java.util.Scanner;

public class LoopsEndingAndRememberingPart5 {
    //Part 5 of Exercises 12 to Week 2
    public static void main(String[] args){
        Scanner myScan2 = new Scanner(System.in);
        int Num;
        int NumbersCounter;
        int EvenNumbers = 0;
        int OddNumbers = 0;
        int Sum = 0;

        while(true){
            System.out.println("Type numbers: ");
            Num = Integer.parseInt(myScan2.nextLine());
            if(Num < 0 || Num == 0){
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + Sum);
                NumbersCounter = EvenNumbers + OddNumbers;
                System.out.println("How many numbers: " + NumbersCounter);

                //Media numerelor
                float Average = (float) Sum / NumbersCounter;
                System.out.println("Average: " + Average);

                //Printarea numarului de numere pare;
                //Printarea numerului de numere impare;

                System.out.println("Even Numbers: " + EvenNumbers);
                System.out.println("Odd Numbers: " + OddNumbers);

                break;
            }else{
                if(Num % 2 == 0){
                    EvenNumbers++;
                }else{
                    OddNumbers++;
                }
                Sum += Num;
            }
        }
    }
}
