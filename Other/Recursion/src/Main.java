public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int max = pow(i);
            for (int j = 1; j <= max; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

    private static int pow(int e) {
        if (e == 1)
            return 2;
        else
            return 2 * pow(e - 1);
    }
}
