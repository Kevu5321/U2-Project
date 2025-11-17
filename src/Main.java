import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("What word would you like the other person to guess?: ");
        String userWord = Scan.nextLine();

//        System.out.println(Randomizer.scrambleWord(userWord));

        for (int i = 0; i < 10; i++){
            int num = (int) (Math.random() * 11);
            System.out.println(num);
        }
    }
}