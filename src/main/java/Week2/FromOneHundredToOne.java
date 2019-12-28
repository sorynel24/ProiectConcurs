package Week2;

public class FromOneHundredToOne {
    //Exercises 4 of Week 2
    public static void main(String[] args){
        int number = 100;

        while (number >= 1){
            System.out.println(number);
            if(number == 1){
                break;
            }
            number--;
        }
    }
}
