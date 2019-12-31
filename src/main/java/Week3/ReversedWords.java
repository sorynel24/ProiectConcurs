package Week3;

import java.util.*;

public class ReversedWords {
    //Exe16
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> Strings = new ArrayList<String>();
        int i = 0;

        while(true){
            System.out.print("Type a word: ");
            String myWord = reader.nextLine();
            Strings.add(myWord);
            if(myWord.isEmpty()){
                i = Strings.size();
                System.out.println("You typed the following words: ");
                while(Strings.size() >= i){
                    i--;
                    System.out.println(Strings.get(i));
                    if(i == 0){
                        break;
                    }
                }
                break;
            }

        }

    }
}
