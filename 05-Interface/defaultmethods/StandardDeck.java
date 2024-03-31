package defaultmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StandardDeck implements Deck {
    private List<Card> entireDeck;

    public StandardDeck() {
        this.entireDeck = new ArrayList<>();
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                this.entireDeck.add(new PlayingCard(r, s));
            }
        }
    }

    @Override

    public void sort() {
        Collections.sort(entireDeck);
    }

    @Override
    public void sort(Comparator<Card> c) {
        Collections.sort(entireDeck, c);
    }

    public void shuffle() {
        Collections.shuffle(entireDeck);
    }

    public String deckToString() {
        return this.entireDeck.stream().map(Card::toString)
                .collect(Collectors.joining("\n"));
    }

    public static void main(String[] args) {
        StandardDeck standardDeck = new StandardDeck();
        System.out.println("Creating deck:");
        standardDeck.sort();
        System.out.println("Sorted deck");
        System.out.println(standardDeck.deckToString());
        standardDeck.shuffle();
        System.out.println("Sorted by rank, then by suit");
        standardDeck.sort(new SortByRankThenSuit());
        System.out.println(standardDeck.deckToString());
        standardDeck.shuffle();
        System.out.println("Sorted by rank, then by suit, use lambda expression");
        standardDeck.sort((first, second) -> {
            int compare = first.getRank().value() - second.getRank().value();
            if (compare != 0)
                return compare;
            return first.getSuit().value() - second.getSuit().value();
        });
        standardDeck.shuffle();
        //使用默认方法替换以上的过程
        standardDeck.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        System.out.println(standardDeck.deckToString());

    }
}
