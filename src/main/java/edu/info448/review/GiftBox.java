package edu.info448.review;

/**
 * A class representing a gift box containing an object
 */
public class GiftBox<T> {

	private T gift; //what is inside the box

	//makes a new gift box containing the gift
	public GiftBox(T gift){
		this.gift = gift;
	}

	//unwraps the gift and returns what's inside
	public T openGift() {
		return this.gift;
	}
}
