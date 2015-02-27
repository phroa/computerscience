import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>() {{
            add("to");
            add("be");
            add("or");
            add("not");
            add("to");
            add("be");
            add("that");
            add("is");
            add("the");
            add("question");
        }};

        System.out.println(strings);
        System.out.println();
        removeInRange(strings, "free", "rich");
        System.out.println(strings);

    }

    private static void removeInRange(ArrayList<String> strings, String start, String end) {

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).compareTo(start) > 0 && strings.get(i).compareTo(end) < 0) strings.remove(i);

        }
    }
}
