import java.util.Random;
import java.util.Scanner;

/**
 * Created by js on 11/25/14.
 */
public class Main {
    static final int ROCK = 0;
    static final int PAPER = 1;
    static final int SCISSORS = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // an infinite loop that keeps track of how many rounds were played.
        for (int round = 1; ; round++) {
            // grab the user's choice, and the computer's randomly selected thing
            int choice = choose(in, round);
            int computer_choice = random();

            // display the choices
            System.out.println("You chose " + humanReadable(choice) + ", and the computer chose " + humanReadable(computer_choice) + ".");
            // who won or tied
            System.out.println(outcome(choice, computer_choice));
            // see if they want to play again, if not, show how many rounds they played and exit.
            if (!playAgain(in)) {
                // intelligently pluralizes "round(s)".
                System.out.println("You played " + round + " round" + (round == 1? "" : "s") + ". Bye.");
                return;
            }
        }
    }

    private static boolean playAgain(Scanner in) {
        System.out.println("Would you like to play again? [Y/n]");
        String s = in.nextLine().toLowerCase().trim();

        return s.startsWith("y");
    }

    private static String outcome(int choice, int computer_choice) {
        switch (choice) {
            // if they chose rock...
            case ROCK:
                // ... and the computer chose scissors, they win.
                if (computer_choice == SCISSORS) return "You win!";
                // ... and the computer chose paper, they lost.
                else if (computer_choice == PAPER) return "You lost!";
                // ... and the computer chose rock, they tied.
                return "Looks like it's a tie.";
            case PAPER:
                if (computer_choice == ROCK) return "You win!";
                else if (computer_choice == SCISSORS) return "You lost!";
                return "Looks like it's a tie.";
            case SCISSORS:
                if (computer_choice == PAPER) return "You win!";
                else if (computer_choice == ROCK) return "You lost!";
                return "Looks like it's a tie.";
            default:
                return "I have no idea what happened, but I'll assume you're a decent RPS player.";
        }
    }

    // super boring. int in 0..2
    private static int random() {
        return new Random().nextInt(3);
    }

    private static int choose(Scanner in, int round) throws IllegalArgumentException {
        // print round number
        System.out.println("Round " + round + ":");
        // while they are entering stupid things that aren't rocks, papers, or scissorses
        while (true) {
            // ask
            System.out.print("Rock, paper, or scissors? ");

            // record what they chose
            String string = in.nextLine().toLowerCase().trim();
            if (string.startsWith("r")) return ROCK;
            if (string.startsWith("p")) return PAPER;
            if (string.startsWith("s")) return SCISSORS;
            else {
                // they didn't choose any of those, so carry on with the infinite loop and just do this all again.
                System.out.println("You need to choose either rock, paper, or scissors.");
            }
        }
    }

    private static String humanReadable(int choice) {
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "absolutely nothing";
        }
    }

}
