import java.util.Arrays;

/**
 * Created by js on 11/25/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(digitRange(89175));
    }

    private static int digitRange(int n) {

        char[] chars = Integer.toString(n).toCharArray();

        Arrays.sort(chars);

        return ((int) chars[chars.length - 1] - (int) chars[0]) + 1;
    }
}
