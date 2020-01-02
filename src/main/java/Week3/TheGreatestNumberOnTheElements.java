package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class TheGreatestNumberOnTheElements {
    //Exe 24
    public static int GreatestNumber(ArrayList<Integer> listOfInteger){
        return Collections.max(listOfInteger);
    }
    public static void main(String[] args){
        ArrayList<Integer> listIntegers = new ArrayList<Integer>();

        listIntegers.add(200);
        listIntegers.add(340);
        listIntegers.add(2000);
        listIntegers.add(1000);

        System.out.println(listIntegers);
        System.out.println("The greatest number is: " + GreatestNumber(listIntegers));
    }
}
