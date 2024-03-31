package defaultmethods;

public class PlayingCard implements Card {
    private Card.Rank rank;
    private Card.Suit suit;

    public PlayingCard(Card.Rank rank, Card.Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public Rank getRank() {
        return rank;
    }

    public int hashCode() {
        return ((suit.value() - 1) * 13) + rank.value();
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     */
    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }

    public String toString() {
        return this.rank.text() + " of " + this.suit.text();
    }
}
