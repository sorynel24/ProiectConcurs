package Week3;

import java.util.ArrayList;
import java.util.List;

public class LengthsOfElementsOfTheList {
    //Exe 23
    public static ArrayList<Integer> lengths(ArrayList<String> list){
        int counter = 0;
        ArrayList<Integer> lengthsOfElements = new ArrayList<Integer>();
        while(counter < list.size()){
            lengthsOfElements.add(list.get(counter).length());
            counter++;
        }
        return lengthsOfElements;
    }
    public static void main(String[] args){
        ArrayList<String> listOfStrings = new ArrayList<String>();

        listOfStrings.add("Ferrari");
        listOfStrings.add("Lamborghini");
        listOfStrings.add("Bentley");

        System.out.println(listOfStrings);
        ArrayList<Integer> lengths =lengths(listOfStrings);

        System.out.println("The lengths of the Strings : " + lengths);
    }
}
