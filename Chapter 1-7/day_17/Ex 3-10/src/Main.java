/**
 * Created by js on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        scientific(6.23, 5);
        scientific(1.19, -2);
    }

    private static void scientific(double number, double power) {
        System.out.println(number * Math.pow(10, power));
    }
}
