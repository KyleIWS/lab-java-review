package edu.info448.review;

/**
 * A simple model class representing a Dog
 * @author Joel Ross
 */
public class Dog extends Animal
{
	public static final String BEST_BREED = "Husky";

	private String name;
	private String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public Dog(String name){
		this(name, "mutt");
	}

	public Dog() {
		this("Fido");
	}

	public void bark() {
		System.out.println(this+" says: Bark! Bark!");
	}

	public void wagTail(int times){
		for(int i=0; i<times; i++){
			System.out.println(this+" wags his tail");
		}
	}

	public String toString() {
		return this.name+" the " +this.breed;
	}

	public static Dog[] createPuppies(int number) {
		Dog[] dogs = new Dog[number];
		for(int i=0; i<dogs.length; i++){
			dogs[i] = new Dog("Puppy-"+(i+1), "Dalmation");
		}
		return dogs;
	}

	public void speak() {
		this.bark();
	}

	public static interface Sniffable {
		public void smellsLike();
	}

	public static class Smell implements Dog.Sniffable{
		
		public String smell;
		
		public Smell(String smell) {
			this.smell = smell;
		}
	
		public void smellsLike() {
			System.out.println("Smells like " + this.smell);
		}
	}

	public void giveSmell(Smell s) {
		s.smellsLike();
	}

}
