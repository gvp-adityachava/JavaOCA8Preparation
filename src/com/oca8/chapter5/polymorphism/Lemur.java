package com.oca8.chapter5.polymorphism;

class Primate {
	public boolean hasHair() {
		return true;
	}
}
interface HasTail {
	public boolean isTailStriped();
}
public class Lemur extends Primate implements HasTail {
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		System.out.println(hasTail.age); 			    // does not compile since it is not accessible.
		Primate primate = lemur;
		System.out.println(primate.hasHair());		
		System.out.println(primate.isTailStriped());	// does not compile since it is not accessible.
	}
}