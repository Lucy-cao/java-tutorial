package defaultmethods;

import java.util.Comparator;

public interface Deck {
    void sort();

    void sort(Comparator<Card> c);
}
