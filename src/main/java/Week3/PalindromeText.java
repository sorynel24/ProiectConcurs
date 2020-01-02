package Week3;

import java.util.Scanner;

public class PalindromeText {
    //Exe27
    public static boolean isPalindrome(String text){
        StringBuilder MyText = new StringBuilder();
        MyText.append(text);
        MyText.reverse();

        return text.equalsIgnoreCase(String.valueOf(MyText));
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        if(isPalindrome(word)){
            System.out.println("The text is a palindrome");
        }else{
            System.out.println("The text is not a palindrome");
        }
    }
}
