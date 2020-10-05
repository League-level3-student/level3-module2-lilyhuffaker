package _07_Cards;

public class Card {
	
	public enum Suits{
		CLUBS, DIAMONDS, HEARTS, SPADES
	}
	public static final int minCardValue = 1;
	public static final int maxCardValue = 13;
	private int _values;
	private Suits _suit;
	
	public Card(int value, Suits suit) {
		setValue(value);
		setSuit(suit);
	}
	
	public int getValue() {
		return _values;
	}
	
	public void setValue(int value) {
		if(value >= minCardValue && value <= maxCardValue) {
			_values = value;
		}
	}
	public String getValueString() {
		int value = getValue();
		if(value >= 2 && value <= 10) {
			return Integer.toString(value);
		}
		switch(value) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return "";
		}
	}
	public Suits getSuit() {
		return _suit;
	}
	
	public void setSuit(Suits suit) {
		_suit = suit;
	}
	public String getSuitString() {
		switch(getSuit()) {
		case CLUBS: return "C";
		case DIAMONDS: return "D";
		case HEARTS: return "H";
		case SPADES: return "S";
		default: return "";
		}
	}
	
	@Override
	public String toString() {
		return getValueString() + getSuitString();
	}
}
