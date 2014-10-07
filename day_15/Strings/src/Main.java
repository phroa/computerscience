/**
 * Created by js on 10/6/14.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "hi?";
        String s2 = "hello";

        System.out.println("Length: " + s1.length());
        System.out.println("Length: " + s2.length());

        System.out.println("Character at 1: " + s1.charAt(s1.length()-1));

        System.out.println("Substring!: " + s2.substring(1, 4).toUpperCase());

    }
}
