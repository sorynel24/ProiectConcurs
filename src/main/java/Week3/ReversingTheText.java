package Week3;

import java.util.Scanner;

public class ReversingTheText {
    //Exe14
    public static StringBuilder ReversingWholeText(String text){
        StringBuilder ReversingText = new StringBuilder(text);
        return ReversingText.reverse();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type your text here: ");
        String text = input.nextLine();
        System.out.print("Reversing your text : \n " + ReversingWholeText(text));
    }
}
