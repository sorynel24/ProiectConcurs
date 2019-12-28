package Week2;

public class PrintingPart3 {
    //Part 3 of Exercises 15 from Week2
    public static void PrintingStars(int amount){
        int counterOne = 0;
        while(counterOne < amount){
            System.out.print("*");
            counterOne++;
        }
    }
    public static void PrintingRectangle(int width, int height){
        int counter = 0;
        while(counter < height){
            PrintingStars(width);
            System.out.println();
            counter++;
        }
    }
    public static void main(String[] args){
        PrintingRectangle(17,3);
    }
}
