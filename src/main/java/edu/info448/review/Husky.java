package edu.info448.review; // This is needed!!!

public class Husky extends Dog implements Huggable {
	public Husky(String name) {
		super(name, "Husky");
	}

	public void pullSled() {
		System.out.println("Pulling sled!");
	}

	public void bark() {
		System.out.println("Woof! Woof!");
	}

	public void hug() {
		System.out.println("Cash me outside");
	}
}
