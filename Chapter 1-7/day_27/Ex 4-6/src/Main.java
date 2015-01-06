import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by js on 11/10/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you have? ");
        int count = in.nextInt();

        int[] numbers = new int[count];

        for (int i=1;i<=count;i++) {
            System.out.print("Number " + i + ": ");
            numbers[i-1] = in.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Smallest Number: " + numbers[0]);
        System.out.println("Biggest Number: " + numbers[numbers.length - 1]);

    }
}
