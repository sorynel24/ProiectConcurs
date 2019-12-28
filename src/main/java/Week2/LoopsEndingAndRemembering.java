package Week2;

import java.util.Scanner;

public class LoopsEndingAndRemembering {
    //Exercises 12 to week 2
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        int MyNum;

        while(true){
            System.out.println("Type numbers: ");
            MyNum = Integer.parseInt(Keyboard.nextLine());
            if(MyNum < 0){
                System.out.println("Thank you and see you later!");
                break;
            }
        }
    }
}
