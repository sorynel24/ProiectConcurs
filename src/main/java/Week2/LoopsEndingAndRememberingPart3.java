package Week2;

import java.util.Scanner;

public class LoopsEndingAndRememberingPart3 {
    //Part 3 of Exercises 12 to Week 2
    public static void main(String[] args){
        Scanner Reader = new Scanner(System.in);
        int TheNum;
        int Counter = 0;

        while(true){
            System.out.println("Type numbers");
            TheNum = Integer.parseInt(Reader.nextLine());

            if(TheNum < 0 || TheNum == 0){
                System.out.println("Thank you and see you later!");
                System.out.println("How many numbers: " + Counter);
                break;
            }else{
                Counter++;
            }
        }
    }
}
