import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private static List<Card> fullDeck = new ArrayList<Card>();

	private static final String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };

	private static final String[] ranks = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King", "Ace" };

	public Deck() {
		for (int rankI = 0; rankI < ranks.length; rankI++) {
			String rank = ranks[rankI];

			for (int suitI = 0; suitI < suits.length; suitI++) {
				String suit = suits[suitI];

				String faceCard = rank + "-" + suit;
				int value = suitI + 2;

				fullDeck.add(new Card(value, faceCard));

			}
		}
	}

	public void shuffle() {

		Collections.shuffle(fullDeck);
	}

	public static Card draw() {
		return fullDeck.remove(0);
	}
}
