package Activity1;

/**
 * Card.java
 * <p/>
 * <code>Card</code> represents a playing card.
 */
public class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;


    public Card(String suit, String rank, int pointValue) {
        this.suit = suit;
        this.rank = rank;
        this.pointValue = pointValue;
    }

    /**
     * Accesses this <code>Card's</code> suit.
     *
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        return suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     *
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     *
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
		return pointValue;
    }

    /**
     * Compare this card with the argument.
     *
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     * are equal to those of the argument;
     * false otherwise.
     */
    public boolean matches(Card otherCard) {
		return rank() == otherCard.rank() && suit() == otherCard.suit() && pointValue() == otherCard.pointValue();
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     * "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     * and point value of the card.
     */
    @Override
    public String toString() {
        return String.format("%s of %s (point value = %d)", rank, suit, pointValue);
    }
}
