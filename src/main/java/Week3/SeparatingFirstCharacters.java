package Week3;

import java.util.Scanner;

public class SeparatingFirstCharacters {
    // Exe 8 from week 3
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = in.nextLine();

        if(name.length() > 3){
            System.out.println("1. character: " + name.charAt(0));
            System.out.println("2. character: " + name.charAt(1));
            System.out.println("3. character: " + name.charAt(2));
        }
    }
}
