import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by js on 12/2/14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("../../reference_files/more_numbers.dat"));

        evenNumbers(in);
    }

    private static void evenNumbers(Scanner in) {
        int evens = 0;
        int sum = 0;

        int i;
        for (i = 1; in.hasNextInt(); i++) {
            int n = in.nextInt();

            System.out.printf("Number %s = %s%n", i, n);

            sum += n;
            if (n % 2 == 0) evens++;
        }

        System.out.printf("%d numbers, sum %d%n", i, sum);
        System.out.printf("Evens: %d/%d numbers (%.2f%%)%n", evens, i, ((double) evens) / i);
    }
}
