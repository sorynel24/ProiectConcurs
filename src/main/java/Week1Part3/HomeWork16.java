package Week1Part3;

import java.util.Scanner;

public class HomeWork16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userAlex = "Alex";
        String passwordAlex = "mightyducks";

        String userEmily = "Emily";
        String passwordEmily = "cat";

        System.out.println("Type the username: ");
        String username_login = in.nextLine();
        System.out.println("Type the password: ");
        String password_login = in.nextLine();

        if((username_login.equals(userAlex)) && (password_login.equals(passwordAlex))){
            System.out.println("You are now logged into in system");
        }else if((username_login.equals(userEmily)) && (password_login.equals(passwordEmily))){
            System.out.println("You are now logged into in system");
        }else{
            System.out.println("The username or password was invalid");
        }

    }
}
