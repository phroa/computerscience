package Activity3;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

    private static final int SHUFFLE_COUNT = 1;

    private static final int VALUE_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) {
            values1[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int value : values1) {
                System.out.print(" " + value);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int value : values2) {
                System.out.print(" " + value);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void perfectShuffle(int[] values) {
        int[] shuffled = new int[values.length];
        int k = 0;
        for (int i = 0; i < values.length / 2; i++) {
            shuffled[k] = values[i];
            k += 2;
        }

        k = 1;

        for (int i = values.length / 2; i < values.length; i++) {
            shuffled[k] = values[i];
            k += 2;
        }

        System.arraycopy(shuffled, 0, values, 0, values.length);
    }

    public static void selectionShuffle(int[] values) {
        Random random = new Random();
        for (int i = values.length - 1; i > 0; i--) {
            int r = random.nextInt(i + 1);
            int temp = values[r];
            values[r] = values[i];
            values[i] = temp;
        }
    }
}
