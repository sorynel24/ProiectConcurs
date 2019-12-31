package Week3;
import java.util.Scanner;
public class ReverseName {
    // Exe 10 from week 3
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        StringBuilder TheName = new StringBuilder(inputScanner.nextLine());
        System.out.println("Reversed name: " + TheName.reverse());
    }
}
