// Reads a file and echos it in uppercase.

import java.io.*;
import java.util.*;

public class EchoUppercase {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("../reference_files/poem.txt"));
        while (input.hasNext()) {
            String text = input.next();
            System.out.println(text.toUpperCase());
        }
    }
}
