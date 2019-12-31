package Week3;

import java.util.Scanner;

public class LastCharacter {
    //Exe 7 from week 3

    public static void LastChar(String name){
        System.out.println("The last character of your name is: " + name.charAt(name.length()-1));

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String TheName = reader.nextLine();
        LastChar(TheName);
    }
}
