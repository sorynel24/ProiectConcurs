package Week3;

public class AverageOfnumbers {
    //Exercises 4 from Week4
    public static double Average(int param1, int param2, int param3, int param4){
        double sum = param1 + param2 + param3 + param4;
        return sum / 4;
    }

    public static void main(String[] args){
        double averageNum = Average(4, 3, 6, 1);
        System.out.println("The answer is: " + averageNum);
    }
}
