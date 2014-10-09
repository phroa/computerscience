/**
 * Created by js on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        vertical("hi there");
    }

    private static void vertical(String s) {
        for (char c : s.toCharArray()) System.out.println(c);
    }
}
