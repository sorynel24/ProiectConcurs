package Week3;

import java.util.Scanner;

public class FirstPartOfTheWord {
    //Exe 11 from week 3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String name = input.nextLine();
        String FirstPart = name.substring(0, 6);
        System.out.println("Length of the first part: " + FirstPart.length());
        System.out.println("Result: " + FirstPart);


    }
}
