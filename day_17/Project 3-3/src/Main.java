/**
 * Created by js on 10/9/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(" Day | Presents Received Today | Total Presents");
        System.out.println("-----+-------------------------+---------------");
//      System.out.println(" 1   | 1                       | 1             ");

        int total = 0;

        // count down the days
        for (int day = 1; day <= 12; day++) {
            total += day;
            System.out.print(' ');

            System.out.print(day);

            // print enough spaces to make the column even
            System.out.print(String.format("%1$" + (4 - Integer.toString(day).length()) + "s", ""));

            System.out.print("| ");

            System.out.print(day);

            // see above
            System.out.print(String.format("%1$" + (24 - Integer.toString(day).length()) + "s", ""));

            System.out.print("| ");

            System.out.print(total);

            System.out.println();

        }

    }
}
