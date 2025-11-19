import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Hello Player 1! ");

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
        for (int i = 0; i <= 10; i++) {
            System.out.println("");
        }

        System.out.println("Hello Player 2!");
        System.out.println("The scrambled word Player 1 chose for you to guess is: " + scrambledWord + "!");

        //Player 2 guess
        System.out.print("Please input your first guess as to what the word could be: ");
        String guess = Scan.nextLine();

        Boolean guessCompared = Randomizer.checkGuess(guess, userWord);
        int attempts = 0;

//        while (!guessCompared) {
//            if (guessCompared) {
//                attempts++;
//                System.out.println("Player 2 guessed the word right in " + attempts + " attempts!");
//            } else {
//                attempts++;
//                System.out.println("Try again!: ");
//                guess = Scan.nextLine();
//                guessCompared = Randomizer.checkGuess(guess, userWord);
//            }
//        }


    }
}