import java.util.Scanner;

/**
 * Created by js on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        birthday(new Scanner(System.in));
    }

    private static void birthday(Scanner scanner) {
        System.out.print("What day of the month were you born on? > ");
        int day = scanner.nextInt();

        System.out.println();

        System.out.print("What month were you born in? > ");
        String month = scanner.next();

        System.out.println();

        System.out.print("What year were you born in? > ");
        int year = scanner.nextInt();

        System.out.println();

        System.out.println("Wow, you're old. You were born on the " + day + suffix(day) + " of " + month.substring(0,1).toUpperCase() + month.substring(1) + ", " + year + ".");

    }

    public static String suffix(int value) {
        int hundredRemainder = value % 100;
        int tenRemainder = value % 10;
        if(hundredRemainder - tenRemainder == 10) {
            return "th";
        }

        switch (tenRemainder) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
