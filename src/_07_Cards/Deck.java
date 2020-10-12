package _07_Cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList <Card>{
	public Deck() {
		for (int i = Card.minCardValue; i <= Card.maxCardValue; i++) {
			Card c = new Card(i, Card.Suits.CLUBS);
			Card d = new Card(i, Card.Suits.DIAMONDS);
			Card h = new Card(i, Card.Suits.HEARTS);
			Card s = new Card(i, Card.Suits.SPADES);
			add(c);
			add(d);
			add(h);
			add(s);
		}
	}
	
	public void shuffle() {
		Random randy = new Random();
		for(int i = 0; i < 100000; i++) {
			int i1 = randy.nextInt(size());
			int i2 = randy.nextInt(size());
			if(i1 != i2) {
				Card temp = get(i1);
				set(i1, get(i2));
				set(i2, temp);
			}
		}
	}
	
	public Hand deal(int count) {
		Hand dealt = new Hand();
		if(count <= size()) {
			for(int i = 0; i < count; i++) {
				dealt.add(this.remove(0));
			}
		}
		return dealt;
	}
}
