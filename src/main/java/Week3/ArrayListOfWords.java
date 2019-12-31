package Week3;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListOfWords {

    public static void ArrayList(){
        Scanner inputScan = new Scanner(System.in);
        ArrayList<String> MyArrayList = new ArrayList<String>();
        int i = 0;

        while(true){
            System.out.print("Type a word: ");
            String word = inputScan.nextLine();
            if(word.isEmpty()){
                System.out.println("You typed the following words: ");
                while(i < MyArrayList.size()){
                    System.out.println(MyArrayList.get(i));
                    i++;
                }
                break;
            }else{
                MyArrayList.add(word);
            }
        }
    }

    //Exe15
    public static void main(String[] args) {
         ArrayList();
    }
}
