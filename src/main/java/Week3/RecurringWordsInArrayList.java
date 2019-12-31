package Week3;

import java.util.*;

public class RecurringWordsInArrayList {
    //Exe16
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        ArrayList<String> ArrayListOfStrings = new ArrayList<String>();
        int i = 0;
        while(true) {
            System.out.print("Type a word: ");
            String word = inputScan.nextLine();
            ArrayListOfStrings.add(word);
            if (word.isEmpty()) {
                break;
            } else if (ArrayListOfStrings.subList(0, i).contains(word)) {
                System.out.println("You give the word " + word + " twice");
                break;
            }
            i++;
        }
    }
}
