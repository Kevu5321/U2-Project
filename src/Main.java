import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("What word would you like the other person to guess?: ");
        String userWord = Scan.nextLine();

        System.out.println(Randomizer.scrambleWord(userWord));

//        System.out.print("Do you like how this word is scrambled? (Type y or n) ");
//        String choice = Scan.nextLine();
//
//        if (choice = "n"){
//
//        }

    }
}

// THIS LINE IS TO CHECK IF THE USER GOT UPDATED IN GITHUB