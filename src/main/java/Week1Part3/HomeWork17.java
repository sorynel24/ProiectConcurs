package Week1Part3;

import java.util.Scanner;

public class HomeWork17 {
    public static void main(String[] args){
        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year to say you if leap: ");
        year = input.nextInt();

        if(year % 4 == 0 || year % 400 == 0) {
             System.out.println(year + " is an leap year");
        }else{
            System.out.println(year + " is not an leap year");
        }
    }
}
