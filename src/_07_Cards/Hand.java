package _07_Cards;

import java.util.ArrayList;

public class Hand extends ArrayList<Card>{

	@Override
	public String toString() {
		String output = "";
		//for (int i = 0; i < size(); i++) {
		//	output += "";
		//}
		for(Card c: this) {
			output += c+"";
		}
		return output;
	}
}
