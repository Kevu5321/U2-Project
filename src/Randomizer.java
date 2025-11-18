public class Randomizer {
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


}

// THIS LINE IS TO CHECK IF THE USER GOT UPDATED IN GITHUB
