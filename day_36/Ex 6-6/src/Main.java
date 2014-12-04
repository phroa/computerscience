import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by js on 12/4/14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        doubleSpace("../../../reference_files/poem.txt", "double_spaced_poem.txt");
    }

    private static void doubleSpace(String input, String output) throws FileNotFoundException {
        Scanner in = new Scanner(new File(input));
        PrintWriter out = new PrintWriter(new File(output));

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line + "\n");
            out.println(line + "\n");
        }

        out.flush();
        out.close();

    }
}
