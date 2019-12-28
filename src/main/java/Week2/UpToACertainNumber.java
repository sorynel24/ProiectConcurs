package Week2;

import java.util.Scanner;

public class UpToACertainNumber {
    //Exercises 6 of Week 2
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number = 0;
        System.out.println("Up to what number?");
        int CertainNumber = Integer.parseInt(reader.nextLine());
        while(number <= CertainNumber){
            if(number == CertainNumber){
                break;
            }
            number++;
            System.out.println(number);
        }

    }
}
