package Week3;

public class TheGreatestNumber {
    //Exercises 3
    public static int greatest(int param1, int param2, int param3){
        if((param1 > param2) && (param1 > param3)){
            return param1;
        }else if((param1 < param2) && (param2 > param3)){
            return param2;
        }else if((param1 < param3) && (param3 > param2)){
            return param3;
        }else{
            return param3;
        }
    }
    public static void main(String[] args){
        int greatestNum = greatest(2, 9, 1);
        System.out.println("The answer is: " + greatestNum);
    }
}
