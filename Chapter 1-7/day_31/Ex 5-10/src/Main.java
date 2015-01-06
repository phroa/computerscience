/**
 * Created by js on 11/24/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(zeroDigits(230584360));
    }

    private static int zeroDigits(int i) {
        int n = 0;
        for (char c : String.valueOf(i).toCharArray())
            if (c == '0')
                n++;
        return n;
    }
}
