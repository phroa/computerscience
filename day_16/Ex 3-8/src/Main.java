import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by js on 10/7/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Solutions for x^2 + 2x - 3 = " + quadratic(1, 2, -3));
        System.out.println("Solutions for x^2 - 7x + 12 = " + quadratic(1, -7, 12));
        System.out.println("Solutions for x^2 + 3x + 2 = " + quadratic(1, 3, 2));
    }

    static Set<Double> quadratic(double a, double b, double c) {

        final double root1, root2;
        root1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        root2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);

        return new HashSet<Double>() {{ add(root1); add(root2); }};
    }

}
