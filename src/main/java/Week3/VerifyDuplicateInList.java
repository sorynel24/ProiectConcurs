package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class VerifyDuplicateInList {
    // Exe 26
    public static boolean moreThanOnce(ArrayList<Integer> IntegersList,  int number){
        int counter = 0;
        int TheSameNumber = 0;
        while(counter < IntegersList.size()){
            if((IntegersList.get(counter)).equals(number)){
                TheSameNumber++;
            }
            counter++;
        }
        if(TheSameNumber >= 2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> ArrayOfIntegers = new ArrayList<Integer>();

        ArrayOfIntegers.add(2);
        ArrayOfIntegers.add(3);
        ArrayOfIntegers.add(4);
        ArrayOfIntegers.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if(moreThanOnce(ArrayOfIntegers, number)){
            System.out.println(number + " appears more than once");
        }else{
            System.out.println(number + " not appears more than one");
        }
    }
}