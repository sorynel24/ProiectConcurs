package Week2;

import java.util.Scanner;

public class TheSumOfNumber {
    // Exercises 11 to Week2
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int num;
        int powerOfNum = 0;
        int result;
        int finalResult = 0;

        System.out.println("Type a number: ");
        num = Integer.parseInt(myScanner.nextLine());
        while(powerOfNum <= num){
            result = (int)Math.pow(2, powerOfNum);
            finalResult += result;
            powerOfNum++;
        }

        System.out.printf("The result is %d", finalResult);

    }
}
