public class Main {
    public static void main(String[] args) {
        writeNums(5);
        System.out.println();
        writeNums(12);
        System.out.println();
    }

    private static void writeNums(int n) {
        if (n == 1) {
            System.out.print(n);
        } else if (n < 1) {
            throw new IllegalArgumentException("n < 1");
        } else {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }
}
