package Week2;

import java.util.Scanner;

public class LowerAndUpperLimit {
    //Exercises 7 to Week 2
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int LowerLimit;
        int UpperLimit;

        System.out.print("First: ");
        LowerLimit = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        UpperLimit = Integer.parseInt(reader.nextLine());

        while(LowerLimit <= UpperLimit){
            System.out.println(LowerLimit);
            if(LowerLimit == UpperLimit){
                break;
            }
            LowerLimit++;

        }
    }
}
