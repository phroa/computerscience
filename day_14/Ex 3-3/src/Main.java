/**
 * Created by js on 10/2/14.
 */
public class Main {
    public static void main(String[] args) {
        printPowers(4, 3);
        printPowers(5, 6);
        printPowers(-2, 8);
    }

    private static void printPowers(int base, int power) {
        for (int i=0;i<=power;i++)
            System.out.print(((int) Math.pow(base, i)) + " ");
        System.out.println();
    }
}
