package Week4;

import java.util.ArrayList;

public class SmartCombining {
    // Exe 2 from Week 4
    public static void smartCombine(ArrayList<Integer> list, Integer number){

        int counter = 0;

        while(counter < list.size()){
            counter++;
            if(list.get(counter).equals(number)){
                System.out.println("This number is more than once!");
                break;
            }else if(!list.get(counter).equals(number)){
                list.add(number);
                System.out.println("The number is added.");
                break;
            }
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<Integer>();


        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        List.add(number1);
        List.add(number2);
        List.add(number3);

        System.out.println(List);

        smartCombine(List, 2);

        System.out.println(List);

    }
}
