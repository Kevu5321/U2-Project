import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Hello Player 1! ");

        //Player 1 input for the word (userWord) to be scrambled
        System.out.print("What word would you like Player 2 to guess?: ");
        String userWord = Scan.nextLine();

        //Scrambles userWord
        String scrambledWord = Randomizer.scrambleWord(userWord);
        System.out.println(scrambledWord);

        //Gives Player 1 the option to rescramble the word if original scramble was not wanted
        String choice = "n";
        while (choice.equals("n") || choice.equals("N")) {
            System.out.print("Do you like how this word is scrambled? (Type y or n): ");
            choice = Scan.nextLine();

            System.out.println();
            if (choice.equals("n") || choice.equals("N")) {
                scrambledWord = Randomizer.scrambleWord(userWord);
                System.out.println(scrambledWord);
            }
        }

        //To create a gap so Player 2 won't see (or at least struggle to see) the original word
        for (int i = 0; i <= 10; i++) {
            System.out.println();
        }

        System.out.println("Hello Player 2!");
        System.out.println("The scrambled word Player 1 chose for you to guess is: " + scrambledWord + "!");


        //Don't know if I will implement this yet
        //System.out.println("If you ever want to forfeit just type \"forfeit\"!");


        //Player 2 guess
        System.out.print("Please input your first guess as to what the word could be: ");
        String guess = Scan.nextLine();

        //Checks if Player 2's guess matches the original word
        boolean guessCompared = Randomizer.checkGuess(guess, userWord);
        int attempts = 0;

        //Tells Player 2 to try again unless they got the correct word
        while (!guessCompared) {
            //Here will go the correct letters amount
            attempts++;
            int lettersCorrect = Randomizer.correctLetters(guess, userWord);
            System.out.println("You got " + lettersCorrect + " letter(s) right out of " + userWord.length() + "!");

            System.out.print("Try again!: ");
            guess = Scan.nextLine();
            guessCompared = Randomizer.checkGuess(guess, userWord);
        }
        attempts++;

        //Fixes the spelling of attempt if Player 2 guesses the word on their first attempt
        if (attempts == 1) {
            System.out.println("Player 2 guessed the word correctly in 1 attempt! Congratulations!");
        } else {
            System.out.println("Player 2 guessed the word correctly in " + attempts + " attempts! Congratulations!");
        }
    }
}