import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by js on 11/13/14.
 */
public class Main {
    public static void main(String[] args) {
        printGPA(new Scanner(System.in));
    }

    private static void printGPA(Scanner scanner) {
        System.out.println("Enter a student's record.");
        String line = scanner.nextLine();

        String[] split = line.split(" ");

        String name = split[0];
        double sum = 0;

        String[] temp = Arrays.copyOfRange(split, 1, split.length);

        for (String s : temp) {
            sum += Double.parseDouble(s);
        }

        System.out.printf("%s's GPA is %.2f%%", name, sum/temp.length);

    }
}
