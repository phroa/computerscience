/**
 * Created by js on 11/13/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(quadrant(.1, 92.4));
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(4.5, -4.5));
    }

    private static int quadrant(double x, double y) {
        return (y == 0 || x == 0) ? 0 : (x > 0) ? (y > 0) ? 1 : (y < 0) ? 4 : (y > 0) ? 2 : (y < 0) ? 3 : 0 : 0;
    }
}
