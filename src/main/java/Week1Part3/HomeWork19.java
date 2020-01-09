package Week1Part3;

import java.util.Scanner;


public class HomeWork19{


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter your floating number please: ");
            double temperature = Double.parseDouble(myScanner.nextLine());

            if(temperature > -30 || temperature < 40){
                Graph.addNumber(temperature);
            }else{
                System.out.println("This temperature are ignored");
                break;
            }
        }


    }
}