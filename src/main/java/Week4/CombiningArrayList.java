package Week4;

import java.util.ArrayList;

public class CombiningArrayList {
    //Exe 1 from week 4
    public static void combine(ArrayList<Integer> firstList, ArrayList<Integer> secondList){
        firstList.addAll(secondList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(2);
        list1.add(5);
        list1.add(8);

        //list 2

        list2.add(3);
        list2.add(7);
        list2.add(9);

        combine(list1, list2);

        System.out.println(list1);

        System.out.println(list2);
    }
}
