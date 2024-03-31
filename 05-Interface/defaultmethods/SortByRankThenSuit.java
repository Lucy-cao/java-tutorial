package defaultmethods;

import java.util.Comparator;

public class SortByRankThenSuit implements Comparator<Card> {
    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     */
    @Override
    public int compare(Card o1, Card o2) {
        int compare = o1.getRank().value() - o2.getRank().value();
        if (compare != 0)
            return compare;
        return o1.getSuit().value() - o2.getSuit().value();
    }
}
