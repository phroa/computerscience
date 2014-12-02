import java.io.*;
import java.util.Scanner;

public class NewFileSum {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("../reference_files/more_numbers.dat");
    Scanner in = new Scanner(f);
    double sum = 0;
    int i = 0;
    while (in.hasNextDouble()) {
      double n = in.nextDouble();
      sum += n;
      i++;
      System.out.println("Number " + i + " = " + n);
    }

    System.out.println("sum = " + sum);

  }
}
