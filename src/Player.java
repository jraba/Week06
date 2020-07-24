import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println(toString());

	}

	public Card flip() {
		return hand.remove(0);

	}

	public void draw(Deck fullDeck) {
		hand.add(Deck.draw());

	}

	public int incrementScore() {
		return score++;

	}

	public List<Card> getHand() {
		return hand;

	}

	public int getScore() {
		return score++;

	}

	public String getName() {
		return name;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player: " + name);

		return builder.toString();
	}

}
