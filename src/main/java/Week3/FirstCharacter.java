package Week3;

import java.util.Scanner;

public class FirstCharacter {
    // Exercises 6 from week 3
    public static void FirstChar(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String NAME = reader.nextLine();
        System.out.print("The first character from your name: " + NAME.charAt(0));
    }
    public static void main(String[] args) {
        FirstChar();
    }
}
