package Week3;

import java.util.ArrayList;

public class TheSumOfElementsInTheList {
    //Exe 21
    public static int sum(ArrayList<Integer> integers){
        int counter = 0;
        int sum = 0;

        while(counter < integers.size()){
            sum += integers.get(counter);
            counter++;
        }
        return sum;
    }
    public static void main(String[] args){
        ArrayList<Integer> myIntList = new ArrayList<Integer>();

        myIntList.add(10);
        myIntList.add(2);
        myIntList.add(23);
        myIntList.add(12);

        System.out.println(myIntList);

        System.out.println("The sum : " + sum(myIntList));

        myIntList.add(200);

        System.out.println(myIntList);

        System.out.println("The sum : " + sum(myIntList));
    }
}
