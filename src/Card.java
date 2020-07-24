
public class Card {

	public int value;
	public String name;

	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public int getValue() {

		return value;
	}

	public String getName(String name) {

		return name;
	}
	
	public void describe(String description) {

		System.out.println(this.toString());

	}
	
	@Override
	public String toString() {
		return Card.class.getSimpleName();

	}

}
