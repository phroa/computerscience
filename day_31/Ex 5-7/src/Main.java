import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Desired dice sum: ");
        int sum = in.nextInt();

        if (!(1 < sum && sum < 12)) throw new IllegalArgumentException(sum + " not within 1 and 12");

        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;

        while (a + b != sum) {
            System.out.println(a + " + " + b + ": " + (a + b));
            a = r.nextInt(6) + 1;
            b = r.nextInt(6) + 1;
        }

        System.out.println("Result: " + a + " + " + b + ": " + (a + b));

    }
}
