package Week1Part3;

import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args){

        String secretMessage = "I love programming";
        while(true){
            Scanner inputPassword = new Scanner(System.in);
            String CorrectPassword = "Killer";
            System.out.print("Enter the password: ");
            String password = inputPassword.nextLine();
            if(password.equals(CorrectPassword)){
                System.out.println("Right!");
                System.out.println(secretMessage);
                break;
            }else{
                System.out.println("Wrong!");
            }
        }
    }
}
