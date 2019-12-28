package Week2;

public class EvenNumbers {
    //Exercises 5 of Week 2
    public static void main(String[] args){
        int number = 0;
        while(number <= 100){
            number++;
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
