import java.util.Scanner;

public class Inclass {
  public static void main(String[] args) {
    /*
     * A cumulative sum is the total of a sequence of numbers.
     * For instance, the sum of {3.2, 1.1, 6.0, 2} might be 13.3
     *
     * This particular program has you keep entering numbers until
     * you put in something other than a double, then it'll spew out
     * the sum.
     */

    Scanner in = new Scanner(System.in);

    System.out.println("Enter some numbers.");
    double n = 0, last = 0;
    int i = 1;
    //note, this is broken and cba to fix
    do {
      System.out.print(i + " (" + n + ") > ");
      last = in.nextDouble();
      n += last;
      i++;
    } while (in.hasNextDouble());
    System.out.println("Sum: " + n);
    in.close();
  }
}
