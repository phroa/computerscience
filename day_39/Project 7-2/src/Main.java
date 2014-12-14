import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by js on 12/13/14.
 */
public class Main {
    static final String word = "xylophone mallet";
    static final int[] guessed = new int[26];
    static final HashSet<Character> uniqueSet = new HashSet<>();
    static final HashSet<Character> guessedSet = new HashSet<>();
    static double dead = 0.0;

    static {
        for (char c : word.toCharArray()) if (c != ' ') uniqueSet.add(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (!dead()) {
            print();

            askForLetter(in);
        }

    }

    private static boolean dead() {
        if (dead >= 1) {
            System.out.println();
            System.out.println("Sorry, it would appear you are dead. Byebye.");
            System.exit(0);
        }
        return dead >= 1;
    }

    private static char askForLetter(Scanner in) {
        System.out.print("Enter a character to guess: ");
        char letter = in.next().toLowerCase().toCharArray()[0];

        while (!guess(letter) && !dead()) {

            System.out.println("You've already guessed '" + letter + "'. Try again.");

            System.out.print("Enter a character to guess: ");
            letter = in.next().toLowerCase().toCharArray()[0];
        }

        return letter;
    }

    private static void print() {
        System.out.println("Here's what you have guessed so far: \n");
        StringBuilder builder = new StringBuilder();

        for (char character : word.toCharArray()) {
            if (character != ' ') builder.append(guessed(character) ? character : '_');
            builder.append(" ");
        }

        System.out.println(builder.toString());
        System.out.println();
    }

    public static boolean guess(char c) {
        if (guessed(c)) {
            dead += 1d/6d;
            System.out.printf("You already guessed that! You're %.2f%% dead now. :(%n", dead * 100);
            return false;
        }
        if (!word.contains(Character.toString(c))) {
            dead += 1d/6d;
            System.out.printf("That isn't in the word. You're %.2f%% dead now. :(%n", dead * 100);
        }
        guessed[intValue(c)] = 1;
        guessedSet.add(c);

        if (guessedSet.equals(uniqueSet)) {
            print();
            System.out.println("Congrats! You win!");
            System.exit(0);
        }

        return true;
    }

    public static boolean guessed(char c) {
        return guessed[intValue(c)] != 0;
    }

    public static int intValue(char c) {
        if (c < 'a') c += 32;
        return c - 97;
    }

}
