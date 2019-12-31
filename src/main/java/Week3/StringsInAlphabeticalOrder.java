package Week3;

import java.util.*;

public class StringsInAlphabeticalOrder {
    //Exe 17
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArrayList = new ArrayList<String>();

        while(true){
            System.out.print("Type any word please: ");
            String word = in.nextLine();
            myArrayList.add(word);

            if(word.isEmpty()){
                Collections.sort(myArrayList);
                for(String strings : myArrayList){
                    System.out.println(strings);
                }
                break;
            }
        }

    }
}
