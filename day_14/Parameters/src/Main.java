/**
 * Created by js on 10/2/14.
 */
public class Main {
    public static void main(String[] args) {
        print(45, 20.3);
        System.out.println(add(40.3,2.9918));
        print(92);

        System.out.println(hypotenuse(3, 4));

        for (int i=1;i<=10;i++) sqrt(i);

        System.out.println();

        double x = Math.exp(Math.PI) - Math.PI;

        System.out.println(Math.ceil(x));

    }

    private static void sqrt(int i) {
        System.out.println("sqrt(" + i + ") = " + Math.sqrt(i));
    }

    private static double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static void print(int i, double v) {
        System.out.println(i + " and " + v);
    }

    private static void print(int i) {
        System.out.println(i);
    }

    private static double add(double a, double b) {
        return a + b;
    }
}
