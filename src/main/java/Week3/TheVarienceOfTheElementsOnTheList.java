package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class TheVarienceOfTheElementsOnTheList {
    //Exe 25
    public static double variance(ArrayList<Integer> ListOfIntegers){
        int sum = 0;
        int counter = 0;
        while(counter < ListOfIntegers.size()){
            sum += ListOfIntegers.get(counter);
            counter++;
        }

        int average = sum / ListOfIntegers.size();

        int i = 0;
        ArrayList<Double> SupportList = new ArrayList<Double>();
        int AnotherSum = 0;

        while(i < ListOfIntegers.size()){
            SupportList.add((double)ListOfIntegers.get(i) - average);
            AnotherSum += SupportList.get(i);
            i++;
        }

        double finalAverage = Math.pow(AnotherSum, 2);

        return finalAverage / (ListOfIntegers.size() - 1);

    }

    public static void main(String[] args){
        ArrayList<Integer> Integers = new ArrayList<Integer>();

        Integers.add(3);
        Integers.add(2);
        Integers.add(7);
        Integers.add(2);

        System.out.println(Integers);

        System.out.println("The variance is: " + variance(Integers));
    }
}
