import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<String>() {{

            Scanner file = new Scanner(new File("words.txt"));

            while (file.hasNext()) add(file.next().toLowerCase());

        }};

        Scanner in = new Scanner(System.in);

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.print("Enter a word to search for: ");

            String word = in.next().toLowerCase();

            int index = Collections.binarySearch(words, word);

            if (index != -1) {
                System.out.printf("%s is a word. (Position %d/%d)%n", word, index, words.size());
            } else {
                System.out.printf("%s isn't a word.%n", word);
            }

            System.out.println();
        }
    }
}
