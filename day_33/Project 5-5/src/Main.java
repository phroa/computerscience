import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by js on 11/25/14.
 */
public class Main {
    static final int WINS = 0;
    static final int LOSSES = 1;

    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSORS = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int[] playerScores = {0, 0};
        int[] playerChoices = {0, 0, 0};
        int[] computerScores = {0, 0};
        int[] computerChoices = {0, 0, 0};
        int draws = 0;

        while (true) {
            System.out.println("Enter your choice.");
            int playerChoice = getThing(in);
            playerChoices[playerChoice]++;

            int computerChoice = r.nextInt(3);
            System.err.println("Computer chose " + computerChoice);
            computerChoices[computerChoice]++;


            boolean playerWon = beats(playerChoice, computerChoice);
            boolean computerWon = beats(computerChoice, playerChoice);
            boolean drew = (playerWon && computerWon);

            if (drew) {
                System.out.println("You tied with " + numberToObject(playerChoice));
                draws++;
            } else if (playerWon) {
                playerScores[WINS]++;

                System.out.println("Congrats, you won. Again? [Y/n] ");
                String c = in.next().toLowerCase();
                if (c.startsWith("n")) {
                    System.out.println("You won " + playerScores[WINS] + " and lost " + playerScores[LOSSES] + " times.");
                    System.out.println("Objects you used: {rocks, papers, scissors} = " + Arrays.toString(playerChoices));
                    System.out.println("The computer won " + computerScores[WINS] + " and lost " + computerScores[LOSSES] + " times.");
                    System.out.println("The computer used: {rocks, papers, scissors} = " + Arrays.toString(computerChoices));
                    System.out.println("There were " + draws + " draws.");
                    return;
                }

            } else if (computerWon) {
                computerScores[WINS]++;

                System.out.println("The computer beat you. Again? [Y/n] ");
                String c = in.next().toLowerCase();
                if (c.startsWith("n")) {
                    System.out.println("You won " + playerScores[WINS] + " and lost " + playerScores[LOSSES] + " times.");
                    System.out.println("Objects you used: {rocks, papers, scissors} = " + Arrays.toString(playerChoices));
                    System.out.println("The computer won " + computerScores[WINS] + " and lost " + computerScores[LOSSES] + " times.");
                    System.out.println("The computer used: {rocks, papers, scissors} = " + Arrays.toString(computerChoices));
                    System.out.println("There were " + draws + " draws.");
                    return;
                }
            }
            System.out.println();
        }
    }

    static String numberToObject(int n) {
        switch (n) {
            case ROCK:
                return "rock";
            case PAPER:
                return "paper";
            case SCISSORS:
                return "scissors";
            default:
                return "";
        }
    }

    static boolean beats(int thing, int second) {
        switch (thing) {
            case ROCK:
                return (second == SCISSORS);
            case PAPER:
                return (second == ROCK);
            case SCISSORS:
                return (second == PAPER);
            default:
                return true;
        }
    }

    static int getThing(Scanner in) {
        String s = in.next().trim().toLowerCase();

        if (s.startsWith("ro"))
            return ROCK;
        else if (s.startsWith("pa"))
            return PAPER;
        else
            return SCISSORS;
    }

    enum Thing {
        ROCK(0),
        PAPER(1),
        SCISSORS(2);

        private Thing(int i) {
        }
    }

}
