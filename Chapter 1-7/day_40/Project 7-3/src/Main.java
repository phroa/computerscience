//Erik N
//Jack S
//Rory F

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game Mastermind! To play, keep guessing 4 digit numbers until you find the correct answer!");
        /* generate some random digits */
        int[] answer = randomize();

        /* print the answer, for debugging */
        //System.err.println(Arrays.toString(answer));

        Scanner in = new Scanner(System.in);
        /* set to false to stop */
        boolean playing = true;

        while (playing) {
            // yes, somehow this does work
            start:
            {
                int[] guess = prompt(in);

                if (correct(answer, guess)) {
                    System.out.println("You've won! The answer was " + Arrays.toString(answer));
                    if (!playAgain(in)) {
                        System.exit(0);
                    }
                    answer = randomize();
                    break start;
                }

                printCorrectDigits(answer, guess);
                printCorrectPlaces(answer, guess);

                System.out.println();
            }
        }
    }

    private static boolean correct(int[] answer, int[] guess) {
        return Arrays.equals(answer, guess);
    }

    private static void printCorrectDigits(int[] digits, int[] guess) {
        System.out.printf("%d digit(s) are correct%n", correctDigits(digits, guess));
    }

    private static void printCorrectPlaces(int[] answer, int[] guess) {
        System.out.printf("%d digit(s) are in the right place%n", correctPlaces(answer, guess));
    }

    private static int correctDigits(int[] answer, int[] guess) {
        /* make some copies so we don't end up editing the originals */
        int[] answer_copy = Arrays.copyOf(answer, answer.length);
        int[] guess_copy = Arrays.copyOf(guess, guess.length);

        Arrays.sort(answer_copy);
        Arrays.sort(guess_copy);

        int correctDigits = 0;

        for (int i = 0; i < 4; i++) {
            boolean found = false;
            for (int j = 0; j < 4 && !found; j++) {
                if (answer_copy[i] == guess_copy[j]) {
                    correctDigits++;
                    found = true;
                    /* at least one digit is correct for the number we're checking against, so continue to the next number */
                    break;
                }
            }
        }

        return correctDigits;
    }

    private static int correctPlaces(int[] answer, int[] guess) {
        int correctPlaces = 0;

        for (int i = 0; i < 4; i++) if (answer[i] == guess[i]) correctPlaces++;

        return correctPlaces;
    }

    public static int[] randomize() {
        Random r = new Random();
        int[] temp = new int[4];
        
        /* 4 random single-digit numbers */
        for (int i = 0; i < 4; i++){
            temp[i] = r.nextInt(10);
        }

        return temp;
    }

    public static int[] prompt(Scanner in) {
        System.out.print("Enter a 4-digit guess: ");
        
        /* accept some input */
        String input = in.next();
        if (input.length() == 4) {
            char[] letters = input.toCharArray();
            int[] guess = new int[4];

            /* subtract 48 to turn the letter code into a proper digit */
            for (int i = 0; i < 4; i++) guess[i] = letters[i] - 48;

            return guess;
        } else return prompt(in);
    }

    public static boolean playAgain(Scanner in) {
        System.out.print("Would you like to play again? [Y/n] ");
        String input = in.next();
        /* true if the input does *not* start with an 'n' - so, yes, yeah, mmhmm, etc */
        return !input.toLowerCase().startsWith("n");
    }

}
