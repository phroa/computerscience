import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>() {{
            add(6);
            add(0);
            add(71);
            add(0);
            add(2);
            add(0);
            add(2);
        }};

        System.out.println(ints);
        System.out.println();
        removeZeroes(ints);
        System.out.println(ints);
    }

    private static void removeZeroes(ArrayList<Integer> ints) {
        ints.removeAll(Arrays.asList(0));
    }
}
