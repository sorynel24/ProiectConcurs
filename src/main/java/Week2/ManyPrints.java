package Week2;

import java.util.Scanner;

public class ManyPrints {
    //Exercises 14 from Week 2
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        int counter = 0;
        int num;

        System.out.print("How many times the text should bre printed?");
        num = Integer.parseInt(inputScanner.nextLine());

        while(counter < num){
            PlainText();
            counter++;
            if(counter == num){
                break;
            }
        }
    }

    public static void PlainText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
