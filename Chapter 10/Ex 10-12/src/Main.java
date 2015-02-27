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
        markLength4(strings);
        System.out.println(strings);

    }

    private static void markLength4(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == 4) {
                strings.add(i, "****");
                i++;
            }
        }
    }
}
