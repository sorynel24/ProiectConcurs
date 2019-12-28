package Week2;

public class Printing {
    //Exercises 15 from Week 2
    public static void PrintingStars(int amount){
        int counter = 0;
        while(counter < amount){
            System.out.print("*");
            counter++;
        }
    }
    public static void main(String[] args){
        PrintingStars(5);
        System.out.println();
        PrintingStars(3);
        System.out.println();
        PrintingStars(9);
    }
}
