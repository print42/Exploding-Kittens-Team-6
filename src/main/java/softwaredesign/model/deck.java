package softwaredesign.model;
import java.util.Collections;
/**
 * Deck class,
 * drawCard(boolean fromTop): Card
 * placeCard(int index) : void
 * shuffleDeck
 */

public class Deck {
    List<int> Deck = new ArrayList<int>(35);
    static Card drawCard(): return Deck[0];
    static Card seeCard(int index) : Card {
        return Deck[index];
    }
    static void placeCard(int index, Card) {
        Deck.add(index,Card);
    }
    static void shuffleDeck() {
        Deck = Collections.shuffle(Deck);
    }
}