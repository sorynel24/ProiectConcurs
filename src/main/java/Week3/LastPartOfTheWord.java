package Week3;

import java.util.Scanner;

public class LastPartOfTheWord {
    //Exercitiu12
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type any word please: ");
        String TheName = input.nextLine();
        String LastPart = TheName.substring(3);
        System.out.println("Length of the last part : " + LastPart.length());
        System.out.println("Result: " + LastPart);

    }
}
