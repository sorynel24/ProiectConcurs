package Week2;

public class PrintingPart4 {
    //Part4 of Exercises15 from Week2
    public static void PrintingStars(int amount){
        int counterA = 0;
        while(counterA < amount){
            System.out.print("*");
            counterA++;
        }
    }

    public static void Triangle(int amountTriangle){
        int counter = 1;
        while(counter <= amountTriangle){
            PrintingStars(counter);
            System.out.println();
            counter++;
        }
    }
    public static void main(String[] args){
        Triangle(7);
    }
}
