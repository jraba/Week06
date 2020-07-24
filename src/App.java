
public class App {

	public static void main(String[] args) {
//3.
		// Deck
		Deck fullDeck = new Deck();
		// Players
		Player playerOne = new Player("Holland");
		Player playerTwo = new Player("Brenchley");

		// Shuffle
		fullDeck.shuffle();

		// Deal the Cards
		cardDeal(fullDeck, playerOne, playerTwo);
		// Play the Game
		play(playerOne, playerTwo);
		// Score
		scorePerRound(playerOne, playerTwo);

	}

	private static void cardDeal(Deck fullDeck, Player playerOne, Player playerTwo) {
//4.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(fullDeck);
			} else {
				playerTwo.draw(fullDeck);
			}
		}
	}

	private static void play(Player playerOne, Player playerTwo) {

// 5.
		for (int i = 0; i < 26; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();

//5a. Comparing Value
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
			} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				playerTwo.incrementScore();
			}
		}
	}

//6./7. Final Score (*Winner* - Shows Winning Player and Score)
	private static void scorePerRound(Player playerOne, Player playerTwo) {

		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("*Winner* " + playerOne + " - Score (" + playerOne.getScore() + ")");
			System.out.println("         " + playerTwo + " - Score (" + playerTwo.getScore() + ")");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("*Winner* " + playerTwo + " - Score (" + playerTwo.getScore() + ")");
			System.out.println("         " + playerOne + " - Score (" + playerOne.getScore() + ")");
		} else {
			System.out.println("Players: " + "Draw");
		}
	}
}
