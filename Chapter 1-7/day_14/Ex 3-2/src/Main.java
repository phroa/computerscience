/**
 * Created by js on 10/2/14.
 */
public class Main {
    public static void main(String[] args) {
        printPowersOfTwo(3);
        printPowersOfTwo(10);
    }

    private static void printPowersOfTwo(int a) {
        for (int i=0;i<=a;i++)
            System.out.print(((int) Math.pow(2, i)) + " ");
        System.out.println();
    }
}
