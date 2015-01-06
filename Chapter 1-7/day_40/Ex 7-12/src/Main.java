import java.util.Arrays;

/**
 * Created by js on 12/18/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(priceIsRight(new int[] {300, 600, 445, 903, 41, 6}, 500));
    }

    private static int priceIsRight(int[] numbers, int price) {
        Arrays.sort(numbers);

        int i = 0;
        int n = -1;

        while (numbers[i] <= price) {
            n = numbers[i];
            i++;
        }

        return n;

    }
}
