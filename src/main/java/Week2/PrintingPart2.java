package Week2;

public class PrintingPart2 {
    //Part 2 of Exercises 15 from Week 2
    public static void PrintingStars(int amount){
        int counterA = 0;
        while(counterA < amount){
            System.out.print("*");
            counterA++;
        }
    }
    public static void printingSquare(int sideSize){
        int counterB = 0;
        while(counterB < sideSize){
            PrintingStars(sideSize);
            System.out.println();
            counterB++;
        }
    }
    public static void main(String[] args){
        printingSquare(5);
    }
}
