import java.util.Scanner;

/**
 * Created by js on 11/13/14.
 */
public class Main {
    public static void main(String[] args) {
        evenSumMax(new Scanner(System.in));
    }

    private static void evenSumMax(Scanner scanner) {
        System.out.print("How many numbers? ");
        int c = scanner.nextInt();

        int[] numbers = new int[c];
        for (int i=1;i<=c;i++) {
            System.out.print("Number " + i + ": ");
            numbers[i-1] = scanner.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int n : numbers) {
            if (n%2 == 1) continue;
            if (n > max) max = n;
            sum += n;
        }

        System.out.println("Sum of all the even numbers: " + sum);
        System.out.println("Biggest even number: " + max);

    }
}
