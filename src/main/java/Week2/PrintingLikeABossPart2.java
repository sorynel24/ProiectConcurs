package Week2;

public class PrintingLikeABossPart2 {
    //Part 2 of exercises 16 from Week2
    public static void printSpaces(int space){
        int counterA = 0;
        while(counterA < space){
            System.out.print(" ");
            counterA++;
        }
    }
    public static void Stars(int amount){
        int counterB = 0;
        while(counterB < amount){
            System.out.print("*");
            counterB++;
        }
    }

    public static void xmasTree(int stars){
        int counterTree = 1;
        int spacesA = stars - 1;
        int spacesB = spacesA / 2;
        while(counterTree <= stars){
            printSpaces(spacesB);
            Stars(counterTree);
            printSpaces(spacesB);
            System.out.println();
            counterTree++;
            counterTree++;
            spacesB--;
        }
        int stemFirCounter = 0;
        stars  = 3;
        spacesB -= 2;
        while(stemFirCounter < 2){
            Stars(stars);
            printSpaces(spacesB);
            System.out.println();
            stemFirCounter++;
        }
    }
    public static void main(String[] args){
        xmasTree(7);
    }
}
