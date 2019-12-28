package Week2;

public class PrintingLikeABoss {
    //Exercises 16 from Week 2
    public static void printWhiteSpaces(int space){
        int counterOne = 0;
        while(counterOne < space){
            System.out.print(" ");
            counterOne++;
        }
    }
    public static void Stars(int amount){
        int counterTwo = 0;
        while(counterTwo < amount){
            System.out.print("*");
            counterTwo++;
        }
    }
    public static void printTriangle(int amount){
        int counterX = 1;
        int spaces = amount - 1;
        while(counterX <= amount){
            printWhiteSpaces(spaces);
            Stars(counterX);
            System.out.println();
            counterX++;
            spaces--;
        }
    }
    public static void main(String[] args){
        printTriangle(4);
    }
}
