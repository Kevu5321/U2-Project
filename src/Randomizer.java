public class Randomizer {
    //Scrambles userWord
    public static String scrambleWord(String userWord) {
        String word = userWord;
        String scrambled = "";

        for (int i = userWord.length(); i > 0; i--) {
            int random = (int) (Math.random() * i);

            scrambled += word.charAt(random);
            word = word.substring(0, random) + word.substring(random + 1);
        }
        return scrambled;
    }

    //Checks if Player 2 got the unscrambled word correct
    public static Boolean checkGuess(String playerGuess, String userWord) {
        String lowerPlayerGuess = playerGuess.toLowerCase();
        String lowerUserWord = userWord.toLowerCase();

        if (lowerUserWord.equals(lowerPlayerGuess)) {
            return true;
        }
        return false;
    }

    //Tells Player 2 how many letters are in the correct position (WIP)
    public static int correctLetters (String playerGuess, String userWord) {
        String lowerPlayerGuess = playerGuess.toLowerCase();
        String lowerUserWord = userWord.toLowerCase();
        String s = "";
        int correct = 0;

        for (int i = 0; i < playerGuess.length() && i < userWord.length(); i++) {
            s += lowerUserWord.substring(i, i+1);

            if (s.equals(lowerPlayerGuess.substring(i, i+1))) {
                correct++;
            }
            s = "";
        }
        return correct;
    }
}