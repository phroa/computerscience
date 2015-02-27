import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>() {{
            add("one");
            add("two");
            add("three");
            add("four");
            add("five");
            add("six");
        }};

        System.out.println(words);

        Collections.sort(words);

        System.out.println(words);

        System.out.println();

        Integer a = 7;
        Integer b = 7;
        Integer c = 9;

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(a));
        System.out.println(b.compareTo(a));

        System.out.println();

        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("c"));
        System.out.println("a".compareTo("c"));
        System.out.println("c".compareTo("a"));
        System.out.println("A".compareTo("c"));
        System.out.println("a".compareTo("a"));

    }
}
