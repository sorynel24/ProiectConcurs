package Week2;

public class HangmanGame {
    //Exercises 18 from week 2
    private String Letter;
    private String SecretWord;

    public boolean GameOn(){
        return true;
    }
    public void printStatus(){
        System.out.println("You have not made any guesses yet.");
        System.out.println("Unused letters: abcdefghijklmnoprstuvwxyz");
    }
    public void printWord(){
        StringBuilder unknownWord = new StringBuilder("??????");
        System.out.println("Word to be guessed" + unknownWord);

    }
    public void printMan(){
        System.out.println(" __ __");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println("/|");
    }
    public void guess(String letter){
        this.Letter = letter;
        SecretWord = "masina";
        if(SecretWord.contains(Letter)){
            System.out.println("The letter " + Letter + " was found in the word");
        }else{
            System.out.println("The letter " + Letter + " is not in this word");
        }
    }
    public static void printMenu(){
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
