/**
 * Created by js on 11/18/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(toBinary(44));
        System.out.println(toBinary(7));
        System.out.println(toBinary(8));
        System.out.println(toBinary(128));
    }

    private static String toBinary(int n) {

        StringBuilder output = new StringBuilder();

        int x = n;

        while (x > 0) {
            output.append(x % 2);
            x /= 2;
        }

        return output.reverse().toString();
    }
}
