import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Hello Player 1! ");

        //Player 1 input for the word (userWord) to be scrambled
        System.out.println("What word would you like Player 2 to guess?");
        System.out.print("Keep in mind that your word must be less than 10 letters and more than 2: ");
        String userWord = Scan.nextLine();

        //Ensures that Player 1's word fits within the character limit
        while (userWord.length() < 3 || userWord.length() > 11) {
            if (userWord.length() > 11) {
                System.out.println("Sorry that word is too long! Please give a shorter word: ");
                userWord = Scan.nextLine();
            } if (userWord.length() < 3) {
                System.out.println("Sorry that word is too short! Please give a longer word: ");
                userWord = Scan.nextLine();
            }
        }

        //Gives Player 1 the option to change the word if they would like a different word
        //without restarting the program
        String change = "y";
        while (change.equals("y") || change.equals("Y")) {
            System.out.print("Would you like to change your word \"" + userWord + "\"? (Type y or n): ");
            change = Scan.nextLine();

            System.out.println();
            if (change.equals("y") || change.equals("Y")) {
                System.out.print("What would you like your new word to be?: ");
                userWord = Scan.nextLine();
            }

            //Ensures that Player 1's new word fits within the character limit
            while (userWord.length() < 3 || userWord.length() > 11) {
                if (userWord.length() > 11) {
                    System.out.println("Sorry that word is too long! Please give a shorter word: ");
                    userWord = Scan.nextLine();
                } if (userWord.length() < 3) {
                    System.out.println("Sorry that word is too short! Please give a longer word: ");
                    userWord = Scan.nextLine();
                }
            }
        }

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

        //Player 2 guess
        System.out.print("Please input your first guess as to what the word could be: ");
        String guess = Scan.nextLine();

        //Checks if Player 2's guess matches the original word
        boolean guessCompared = Randomizer.checkGuess(guess, userWord);
        int attempts = 0;

        //Tells Player 2 to try again unless they got the correct word
        while (!guessCompared) {
            //Tells Player 2 how many letters they got correct in their guess
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