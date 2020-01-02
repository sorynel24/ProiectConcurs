package Week3;

import java.util.ArrayList;

public class TheAverageOfElementsOnTheList {
    //Exe 22
    public static double TheAverage(ArrayList<Integer> ListOfIntegers){
        int counter = 0;
        int sum = 0;
        double average = 0.0;
        while(counter < ListOfIntegers.size()){
            sum += ListOfIntegers.get(counter);
            counter++;
        }
        average = (double) sum / ListOfIntegers.size();
        return average;
    }
    public static void main(String[] args){
        ArrayList<Integer> ArrayOfIntegers = new ArrayList<Integer>();

        ArrayOfIntegers.add(100);
        ArrayOfIntegers.add(20);
        ArrayOfIntegers.add(12);
        ArrayOfIntegers.add(25);

        System.out.println(ArrayOfIntegers);

        System.out.println("The average: " + TheAverage(ArrayOfIntegers));
    }
}
