package Week1;

public class HomeWork3 {
    public static void main(String[] args){
        int numberOfSecondInAnHour = 3600;
        int numberOfHourInAnDay = 24;

        int totalOfSecondsInAnDay = numberOfSecondInAnHour * numberOfHourInAnDay;

        int totalOfSecondsInAnYear = totalOfSecondsInAnDay * 365;

        System.out.println("There are " + totalOfSecondsInAnYear + " seconds in a year");

    }
}
