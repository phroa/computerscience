import java.util.Arrays;

/**
 * Created by js on 11/25/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(2, 4, 6));
        System.out.println(hasMidpoint(4, 7, 19));
        System.out.println(hasMidpoint(10, 20, 15));
    }

    private static boolean hasMidpoint(int a, int b, int c) {

        int[] array = {a, b, c};

        Arrays.sort(array);

        return ((array[0] + array[2]) / 2) == array[1];

    }
}
