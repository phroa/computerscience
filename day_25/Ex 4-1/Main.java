import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many terms in the sequence? ");
    int terms = in.nextInt();
    double sum = 1;
    System.out.print("1/1");

    for (int i=2;i<=terms;i++) {
      System.out.print(" + 1/" + i);
      sum += 1.0/i;
    }
    System.out.println("\nSum: " + sum);
  }
}
