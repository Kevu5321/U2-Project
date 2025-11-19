public class Randomizer {
    //Scrambles userWord
    public static String scrambleWord(String userWord) {
        String word = userWord;
        String scrambled = "";

        for (int i = userWord.length(); i > 0; i--){
            int random = (int) (Math.random() * i);

            scrambled += word.charAt(random);
            word = word.substring(0, random) + word.substring(random + 1);
        }
        return scrambled;
    }

    //Checks if user got the unscrambled word correct
    public static Boolean checkGuess(String playerGuess, String userWord) {
        String lowerPlayerGuess = playerGuess.toLowerCase();
        String lowerUserWord = userWord.toLowerCase();
        String s = "";

//        int guessLength = playerGuess.length();
//        int wordLength = userWord.length();

        for (int i = 0; i < userWord.length(); i++){
            s += lowerUserWord.substring(0, i);
            if (s.equals(lowerUserWord.substring(0, i)));
        }
        //Temporary return statement
        return lowerPlayerGuess;
    }
}

//Temporary code in case needed is below

//public static String guessesCount(String playerGuess, String userWord) {
//    int guessLength = playerGuess.length();
//    int wordLength = userWord.length();
//
//    for ()
//}