import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>() {{
            add("String One");
            add("String Two");
            add("String Three");
            add("String Four");
        }};

        System.out.println(strings);
        doubleList(strings);
        System.out.println(strings);

    }

    private static void doubleList(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.add(i, strings.get(i));
            i++;
        }
    }
}
