package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveTheLastElementOfArrayList {
    //Exe 20
    public static void removeLast(ArrayList<String> ListOfArray){
        ListOfArray.remove(ListOfArray.size()-1);
    }
    public static void main(String[] args){
        ArrayList<String> ListOfStrings = new ArrayList<String>();

        ListOfStrings.add("Micheal");
        ListOfStrings.add("Alexander");
        ListOfStrings.add("Bob");
        ListOfStrings.add("Christian");

        System.out.println("Brothers: ");
        System.out.println(ListOfStrings);

        Collections.sort(ListOfStrings);

        removeLast(ListOfStrings);

        System.out.println(ListOfStrings);

    }
}
