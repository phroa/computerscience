/**
 * Created by js on 10/7/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(biggerAbsoluteValue(4, -9));
        System.out.println(biggerAbsoluteValue(-1, 0));
        System.out.println(biggerAbsoluteValue(93, 67));
        System.out.println(biggerAbsoluteValue(-8, -9));
        System.out.println(biggerAbsoluteValue(60, -9));
    }

    private static int biggerAbsoluteValue(int i, int j) {
        return Math.abs(i) > Math.abs(j) ? Math.abs(i): Math.abs(j);
    }
}
