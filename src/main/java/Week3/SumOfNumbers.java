package Week3;

public class SumOfNumbers {
    // Exe1 from week 3
    public static int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    public static void main(String[] args){
        int sumOfNumbers = sum(4, 3, 6, 1);
        System.out.println("The answer is: " + sumOfNumbers);
    }
}
