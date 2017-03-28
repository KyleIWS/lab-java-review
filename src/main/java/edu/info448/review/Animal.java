package edu.info448.review;

/**
 * A parent class for Animals
 * @author Joel Ross
 */
public abstract class Animal
{
	public Animal(){
		//empty constructor
	}

	public void walk() {
		System.out.println(this+" walks.");
	}

	public abstract void speak();

	public String toString() {
		return "An Animal";
	}
}

