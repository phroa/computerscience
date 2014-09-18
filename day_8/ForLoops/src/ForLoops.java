/**
 * Created by js on 9/18/14.
 */
public class ForLoops {
    public static void main(String[] args) {

        // I suppose I wasn't supposed to make the first star program using for loops.

        // Meh.

        for (int i = 1; i <= 5; i++) {
            System.out.println("* * * * *");
        }

        System.out.println("the end.");


        // okay this isn't quite as assigned
        for (int i=0;i<5;) System.out.println("* * * * * : " + ++i);
        for (int i=0;i<5;) System.out.println("_ _ _ _ _ : " + ++i);
        for (int i=0;i<2;) System.out.println("* * * * * : " + ++i);
        for (int i=0;i<2;) System.out.println("_ _ _ _ _ : " + ++i);

    }
}
