package Week3;


import java.util.ArrayList;

public class AmountOfItemsInAList {
    //Exe 19
    public static int countItems(ArrayList<String> Strings){
        return Strings.size();
    }

    public static void main(String[] args){
        ArrayList<String> ListOfStrings = new ArrayList<String>();

        ListOfStrings.add("Java");
        ListOfStrings.add("C++");
        ListOfStrings.add("C#");
        ListOfStrings.add("Pascal");
        System.out.println("There are this many items in the list: ");
        System.out.println(countItems(ListOfStrings));

    }
}
