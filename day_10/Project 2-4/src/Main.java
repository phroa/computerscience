/**
 * Created by js on 9/23/14.
 */
public class Main {

    static final String head = "  o  ******";
    static final String arms = " /|\\ *     ";
    static final String legs = " / \\ *     ";

    static final int STAIRS = 8;

    public static void main(String[] args) {

        int length = (STAIRS - 1) * 5;

        for (int i = 0; i < STAIRS; i++) {

            int pre = length - i * 5;
            int post = length - pre;

            StringBuilder preBuilder = new StringBuilder();
            for (int j=0;j<pre;j++)
                preBuilder.append(" ");

            String preString = preBuilder.toString();

            StringBuilder postBuilder = new StringBuilder();
            for (int j=0;j<post;j++)
                postBuilder.append(" ");

            String postString = postBuilder.toString();

            System.out.print(preString + head + postString + "*\n" + preString + arms + postString + "*\n" + preString + legs + postString + "*\n");
        }

        for (int i=0;i<(5*(STAIRS+1)+2);i++) {
            System.out.print('*');
        }
    }
}

/* output
                                     o  *******
                                    /|\ *     *
                                    / \ *     *
                                o  ******     *
                               /|\ *          *
                               / \ *          *
                           o  ******          *
                          /|\ *               *
                          / \ *               *
                      o  ******               *
                     /|\ *                    *
                     / \ *                    *
                 o  ******                    *
                /|\ *                         *
                / \ *                         *
            o  ******                         *
           /|\ *                              *
           / \ *                              *
       o  ******                              *
      /|\ *                                   *
      / \ *                                   *
  o  ******                                   *
 /|\ *                                        *
 / \ *                                        *
***********************************************
 */
