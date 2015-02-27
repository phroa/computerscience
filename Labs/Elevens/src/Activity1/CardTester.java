package Activity1;

import java.util.ArrayList;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>() {{
            add(new Card("hearts", "ten", 10));
            add(new Card("clubs", "three", 3));
            add(new Card("spades", "king", 10));
        }};

        for (Card card : cards) {
            System.out.println(card);
            System.out.println(card.matches(new Card("clubs", "three", 3)));
            System.out.println();
        }
    }
}
