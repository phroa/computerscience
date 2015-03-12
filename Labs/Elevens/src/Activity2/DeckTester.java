package Activity2;

import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args) {

        ArrayList<String> ranks = new ArrayList<String>() {{
            add("two");
            add("three");
            add("four");
            add("five");
            add("six");
            add("seven");
            add("eight");
            add("nine");
            add("ten");
            add("jack");
            add("queen");
            add("king");
            add("ace");
        }};

        ArrayList<String> suits = new ArrayList<String>() {{
            add("spades");
            add("clubs");
            add("hearts");
            add("diamonds");
        }};

        ArrayList<Integer> values = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};

        Deck d = new Deck(ranks, suits, values);

        System.out.println(d.getCards());

        System.out.println();

        System.out.println(d.size() + " cards total");

        System.out.println();

        d.shuffle();

        System.out.println(d.getCards());

        System.out.println();

        while (!d.isEmpty()) System.out.println(d.deal());

        System.out.println("empty");

        System.out.println();

        System.out.println("are the cards still in the deck, though?");

        System.out.println(d.getCards());

    }
}
