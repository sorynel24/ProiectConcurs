package Week3;

import java.util.Scanner;

public class SeparatingAllCharacters {
    //Exe 9 from week 3
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = inputScan.nextLine();
        int i = 0;

        while(i < name.length()){
            int x = i + 1;
            System.out.println(x + ". Character: " + name.charAt(i));
            i++;
        }
    }

}
