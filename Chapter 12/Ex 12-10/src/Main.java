public class Main {
    public static void main(String[] args) {
        System.out.println(repeat("hi ", 4));
    }

    private static String repeat(String s, int n) {
        if (n == 1) return s;
        return s + repeat(s, n - 1);
    }
}
