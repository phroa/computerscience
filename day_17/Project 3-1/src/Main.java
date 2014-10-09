/**
 * Created by js on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        tree(3, 5);
    }

    private static void tree(int segments, int linesPer) {
        for (int i=0;i<segments;i++) {
            for (int j=0;j<linesPer;j++) {

                int stars = (j * 2) + 1;
                int spaces = linesPer - j;

                for (int k = 0;k<spaces;k++)
                    System.out.print(' ');

                for (int k = 0;k<stars;k++)
                    System.out.print('*');
                System.out.println();
            }
        }
        for (int i=0;i<2;i++) {
            for (int j = 0; j < linesPer; j++) {
                System.out.print(' ');
            }
            System.out.print("*\n");
        }

        for (int i=0;i<(linesPer * 2 - 1)-7;i++) {
            System.out.print(' ');
        }
        System.out.println("*******");

    }
}
