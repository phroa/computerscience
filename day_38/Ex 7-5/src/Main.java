/**
 * Created by js on 12/10/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(mode(new int[]{5, 8, 8, 5, 5, 8, 4, 6, 1, 5, 3}));
    }

    private static int mode(int[] numbers) {
        int mode = -1;
        int modecount = 0;

        for (int n : numbers) {
            int count = count(n, numbers);
            if (count > modecount) {
                mode = n;
                modecount = count;
            } else if (count == modecount) {
                mode = Math.min(n, mode); // take the smaller number in case of a tie, as per assignment
            }
        }

        return mode;
    }

    private static int count(int n, int[] numbers) {
        int count = 0;
        for (int i : numbers) if (n == i) count++;
        return count;
    }
}


