/**
 * Created by js on 9/11/14.
 */
public class Decomposition {
    public static void main(String[] args) {
        for (int i=0;i<5;i++) underscores(); //five of those
        for (int i=0;i<5;i++) asterisks(); //five of these
        for (int i=0;i<2;i++) underscores(); //two more of those
        for (int i=0;i<2;i++) asterisks(); //two more of these
    }

    public static void underscores() {
        System.out.println("_ _ _ _ _");
    }

    public static void asterisks() {
        System.out.println("_ _ _ _ _");
    }
}
