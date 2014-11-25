import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by js on 11/25/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("unique numbers: " + unique(3, 3, 6, 7, 4, 7));
    }

    private static int unique(int... i) {

        Set<Integer> s = new HashSet<Integer>();

        for (int n : i)
            s.add(n);

        return s.size();
    }
}
