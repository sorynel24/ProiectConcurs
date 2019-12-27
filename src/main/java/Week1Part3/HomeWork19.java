package Week1Part3;


import java.util.Scanner;

public class HomeWork19 {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        while(true){
            System.out.println("Type the floating number: ");
            double temperature = Double.parseDouble(inputNum.nextLine());
            

            if(temperature > -30.0 && temperature < 40.0){
                System.out.println("The temperature is " + temperature);
            }else{
                System.out.println("This temperature are ignored");
            }
        }
    }
}
