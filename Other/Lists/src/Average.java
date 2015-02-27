import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter one number per line, or -1 to stop.");

        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == -1) break;
            numbers.add(n);
        }

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", (double) sum / numbers.size());
        System.out.printf("The number 9 was%sfound%s%n",
                numbers.contains(9) ? " " : " not ",
                numbers.contains(9) ? " at index " + numbers.indexOf(9) + "." : ".");
    }
}
