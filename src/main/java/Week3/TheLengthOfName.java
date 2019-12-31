package Week3;

import java.util.Scanner;

public class TheLengthOfName {
    //Exercises 5 from Week 4
    public static void lengthOfName(){
        Scanner inputScan = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = inputScan.nextLine();
        System.out.print("The length of your name: " + name.length());
    }
    public static void main(String[] args){
        lengthOfName();
    }
}
