package Activity2;

import Activity1.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private int size;

    public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values) {

        ArrayList<Card> temp = new ArrayList<Card>();

        for (int i = 0; i < Math.max(ranks.size(), Math.max(suits.size(), values.size())); i++) {

            String currentRank;
            String currentSuit;
            int currentValue;

            try {
                currentRank = ranks.get(i);
            } catch (IndexOutOfBoundsException ex) {
                currentRank = ranks.get(ranks.size() - 1);
            }

            try {
                currentSuit = suits.get(i);
            } catch (IndexOutOfBoundsException ex) {
                currentSuit = suits.get(suits.size() - 1);
            }

            try {
                currentValue = values.get(i);
            } catch (IndexOutOfBoundsException ex) {
                currentValue = values.get(values.size() - 1);
            }

            temp.add(new Card(currentSuit, currentRank, currentValue));
        }

        this.cards = temp;
        this.size = temp.size();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (isEmpty()) return null;

        return cards.get(--size);
    }
}
