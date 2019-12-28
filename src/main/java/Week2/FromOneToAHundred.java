package Week2;

public class FromOneToAHundred {
    //Exercises 3 of Week 2
    public static void main(String[] args){
        int number = 0;

        while(number <= 100){
            number++;
            System.out.println(number);
            if(number == 100){
                break;
            }
        }
    }
}
