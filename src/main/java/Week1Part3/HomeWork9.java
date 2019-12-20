package Week1Part3;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Care este numele tau user1?");
        String nameUser1 = in.nextLine();
        System.out.println("Si care este varsta ta " + nameUser1 + ":");
        int ageUser1 = in.nextInt();

        System.out.println("Care este numele tau user2?");
        String nameUser2 = in.next();
        System.out.println("Si care este varsta ta " + nameUser2 + ":");
        int ageUser2 = in.nextInt();

        System.out.printf("%s and %s are %d years old in total",
                nameUser1, nameUser2, (ageUser1 + ageUser2));

    }
}
