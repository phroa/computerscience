import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>() {{
            add("String One");
            add("String Two");
            add("String Three");
            add("String Four");
            add("Even Length String");
            add("Odd Length String");
        }};

        System.out.println(strings);
        removeEvenLength(strings);
        System.out.println(strings);
    }

    public static void removeEvenLength(ArrayList<String> array) {
        ArrayList<String> toRemove = new ArrayList<String>();

        for (String s : array) if (s.length() % 2 == 0) toRemove.add(s);

        array.removeAll(toRemove);
    }
}
