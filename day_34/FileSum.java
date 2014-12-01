import java.io.*;
import java.util.Scanner;

public class FileSum {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File("../reference_files/numbers.dat"));
    double sum = 0;
    for (int i = 1; i <= 5; i++) {
      double n = in.nextDouble();
      System.out.println("number " + i + " = " + in.nextDouble());
      sum += n;
    }
  }
}
