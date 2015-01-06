import java.io.*;

public class Output {
  public static void main(String[] args) throws FileNotFoundException {
    PrintStream out = new PrintStream(new File("file.txt"));

    out.println("Hi");
    out.println("Another line");

  }
}
