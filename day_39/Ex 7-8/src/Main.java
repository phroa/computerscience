import java.util.Arrays;

/**
 * Created by js on 12/13/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(median(new int[] {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17}));
    }

    private static int median(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length / 2];

    }
}
