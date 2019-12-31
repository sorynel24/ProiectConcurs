package Week3;

import java.util.Scanner;
public class AWordInsideAWord {
    // exe 13
    public static void A_Word_Inside_A_Word(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = input.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = input.nextLine();
        int index = firstWord.indexOf(secondWord);

        if(firstWord.contains(secondWord)){
            System.out.printf("The word '%s' found in the word '%s' ", secondWord, firstWord);
        }else{
            System.out.printf("The word '%s' not found in the word '%s' ", secondWord, firstWord);
        }

    }
    public static void main(String[] args) {
        A_Word_Inside_A_Word();
    }
}
