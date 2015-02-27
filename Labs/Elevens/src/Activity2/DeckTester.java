package Activity2;

import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args) {

        ArrayList<String> ranks = new ArrayList<String>() {{
            add("king");
            add("four");
            add("ten");
            add("ace");
        }};

        ArrayList<String> suits = new ArrayList<String>() {{
            add("clubs");
            add("spades");
            add("hearts");
        }};

        ArrayList<Integer> values = new ArrayList<Integer>() {{
            add(10);
            add(4);
            add(10);
            add(10);
        }};

        Deck d = new Deck(ranks, suits, values);

        System.out.println(d.getCards());
        System.out.println(d.size());

        System.out.println();

        d.shuffle();

        System.out.println(d.getCards());

        System.out.println();

        while (!d.isEmpty()) System.out.println(d.deal());

        System.out.println("empty");

    }
}
