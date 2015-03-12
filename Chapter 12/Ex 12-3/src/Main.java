public class Main {
    public static void main(String[] args) {
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
        System.out.println();
        writeSequence(6);
        System.out.println();
        writeSequence(7);
        System.out.println();
    }

    private static void writeSequence(int n) {
        if (n < 1) throw new IllegalArgumentException();

        if (n == 1) System.out.print("1");
        if (n == 2) System.out.print("1 1");
        if (n >= 3) {
            String output = "" + ((n + 1) / 2);
            System.out.print(output + " ");

            writeSequence(n - 2);

            System.out.print(" " + output);
        }
    }
}
