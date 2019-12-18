package Week1;

public class HomeWork3 {
    public static void main(String[] args){
        int SecondInAnHour = 3600;
        int HourInAnDay = 24;

        int totalOfSecondsInAnDay = SecondInAnHour * HourInAnDay;

        int totalOfSecondsInAnYear = totalOfSecondsInAnDay * 365;

        System.out.println("There are " + totalOfSecondsInAnYear + " seconds in a year");

    }
}
