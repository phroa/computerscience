/**
 * Created by js on 9/30/14.
 */
public class Main {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
        try {
            printNumbers(Integer.parseInt(args[0]));
        } catch (Exception nope) {}
    }

    public static void printNumbers(int max) {
        for (int i=1;i<=max;i++)
            System.out.print("[" + i + "]");
        System.out.println();
    }
}
