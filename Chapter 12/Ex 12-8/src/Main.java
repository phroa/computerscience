public class Main {
    public static void main(String[] args) {
        System.out.println(multiplyEvens(1));
        System.out.println(multiplyEvens(2));
        System.out.println(multiplyEvens(3));
        System.out.println(multiplyEvens(4));
        System.out.println(multiplyEvens(5));
    }

    private static int multiplyEvens(int n) {
        if (n <= 0) throw new IllegalArgumentException("n <= 0");
        if (n == 1) return 2;

        return multiplyEvens(n - 1) * (2 * n);
    }
}
