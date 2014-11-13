/**
 * Created by js on 11/13/14.
 */
public class Main {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        //printTriangleType(2, 18, 2); // exception
    }

    private static void printTriangleType(int a, int b, int c) {
        int sum = a + b + c;
        if (a > b + c || b > a + c || c > a + b)
            throw new IllegalArgumentException("Side longer than the sum of the other two, can't continue");

        if (a == b && b == c && a == c) {
            System.out.printf("(%d, %d, %d) is equilateral%n", a, b, c);
            return;
        }

        if (a == b || b == c || a == c) {
            System.out.printf("(%d, %d, %d) is isosceles%n", a, b, c);
            return;
        }
        System.out.printf("(%d, %d, %d) is scalene%n", a, b, c);
    }
}
