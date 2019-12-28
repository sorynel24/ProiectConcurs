package Week3;

public class LeastNumber {
    //Exercises 2 from week 3
    public static int least(int num1, int num2){
        if(num1 > num2){
            return num2;
        }else if(num1 < num2){
            return num1;
        }else{
            System.out.println("Both numbers are equals");
            return num2;
        }
    }
    public static void main(String[] args){
        int leastNum = least(5, 1);
        System.out.println(leastNum);
    }
}
