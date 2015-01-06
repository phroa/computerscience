import java.util.Random;

/**
 * Created by js on 11/24/14.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int n;

        do {
            n = r.nextInt(1000);
            System.out.println("Random number: " + n);
        } while (n < 900);

    }
}
