import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Hello Player 2! ");

        //User input for the word (userInput) to be scrambled
        System.out.print("What word would you like Player 2 to guess?: ");
        String userWord = Scan.nextLine();

        //Scrambles userWord
        String scrambledWord = Randomizer.scrambleWord(userWord);
        System.out.println(scrambledWord);

        //Gives user the option to rescramble the word if original scramble was not wanted
        String choice = "n";
        while (choice.equals("n") || choice.equals("N")){
            System.out.print("Do you like how this word is scrambled? (Type y or n): ");
            choice = Scan.nextLine();

            System.out.println("");
            if (choice.equals("n") || choice.equals("N")){
                scrambledWord = Randomizer.scrambleWord(userWord);
                System.out.println(scrambledWord);
            }
        }

        //To create a gap so Player 2 won't see (or at least struggle to see) the original word.
        for (int i = 0; i<=10; i++) {
            System.out.println("");
        }

        System.out.println("Hello Player 2!");
        System.out.println("The scrambled word Player 1 chose for you to guess is: " + scrambledWord + "!");


    }
}