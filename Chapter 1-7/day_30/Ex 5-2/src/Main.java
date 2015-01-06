/**
 * Created by js on 11/18/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(88, 44));
    }

    private static int gcd(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
