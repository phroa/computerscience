import java.util.Scanner;

/**
 * Created by js on 10/14/14.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("This program asks for the three sides of a triangle, and will output the measure of its angles.");

        // Prompt the user for three sides of a triangle, store as an array
        int[] sides = prompt();

        //                 side b    side c    side a
        double A = cosine(sides[1], sides[2], sides[0]);
        //                 side a    side c    side b
        double B = cosine(sides[0], sides[2], sides[1]);
        //                 side a    side b    side c
        double C = cosine(sides[0], sides[1], sides[2]);

        System.out.println();
        // describe what's happening
        System.out.println("c^2 - b^2 - a^2\n");
        System.out.println("--------------- = Angle C\n");
        System.out.println("     -2ab");
        System.out.println("\n...etc");

        // results!
        System.out.println(String.format("\nAngle A ≈ %.2f", A));
        System.out.println(String.format("Angle B ≈ %.2f", B));
        System.out.println(String.format("Angle C ≈ %.2f", C));
        System.out.println("         ------");
        System.out.println(String.format("         %.2f", A + B + C));

    }

    static int[] prompt() {
        Scanner s = new Scanner(System.in);

        // ask for side A
        System.out.println();
        System.out.print("Side A: ");
        int a = s.nextInt();

        // side b
        System.out.print("Side B: ");
        int b = s.nextInt();

        // and side c
        System.out.print("Side C: ");
        int c = s.nextInt();

        s.close();

        // return a list of the answers, to avoid three different prompt();s
        return new int[]{a, b, c};
    }

    static double cosine(int a, int b, int c) {
        // square each side, store in _s
        double as = sq(a), bs = sq(b), cs = sq(c);

        int ab = twoAB(a, b);

        // acos returns radians, convert to degrees.
        return Math.toDegrees(
                // cos-1()
                Math.acos(
                        // c^2 - a^2 - b^2 / -2ab
                        (cs - as - bs) / (-ab)
                ));
    }

    // easy squaring method
    static double sq(double x) {
        return x * x;
    }

    // find 2 * a * b
    static int twoAB(int a, int b) {
        return 2 * a * b;
    }

}
