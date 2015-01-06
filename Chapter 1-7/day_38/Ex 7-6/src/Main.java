/**
 * Created by js on 12/10/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(stdev(new int[] {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}));
    }

    private static double stdev(int[] numbers) {
        int mean = 0;
        for (int n : numbers) mean += n;
        mean /= numbers.length;

        double variance = 0;
        for (int n : numbers)
            variance += Math.pow((n - mean), 2);

        return Math.sqrt(variance / (numbers.length - 1));
    }
}
