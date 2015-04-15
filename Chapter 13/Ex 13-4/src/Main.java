import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
            System.out.print("Enter two words to search for: ");

            String first = in.next().toLowerCase();
            String second = in.next().toLowerCase();

            int firstIndex = binarySearch(words, first);
            int secondIndex = binarySearch(words, second);

            if (firstIndex == -1 || secondIndex == -1) {
                System.out.println("Couldn't find one of those.");
            } else {
                System.out.printf("%s is %d words away from %s.", first, Math.abs(firstIndex - secondIndex) + 1, second);
            }

            System.out.println();
        }
    }

    private static int binarySearch(ArrayList<String> arrayList, String thing) {
        int left = 0;
        int right = arrayList.size() - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (arrayList.get(middle).equals(thing)) return middle;
            if (arrayList.get(middle).compareTo(thing) > 0) {
                right = middle - 1;
                continue;
            }
            if (arrayList.get(middle).compareTo(thing) < 0) {
                left = middle + 1;
                continue;
            }

            return middle;

        }

        return -1;
    }
}
