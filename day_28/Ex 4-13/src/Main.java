/**
 * Created by js on 11/13/14.
 */
public class Main {
    public static void main(String[] args) {
        printPalindrome("hi there");
        printPalindrome("kayak");
        printPalindrome("not a palindrome");
        printPalindrome("racecar");
    }

    private static void printPalindrome(String string) {
        System.out.printf("\"%s\" is %s palindrome.%n", string, string.equals(new StringBuilder(string).reverse().toString()) ? "a" : "not a");
    }
}
