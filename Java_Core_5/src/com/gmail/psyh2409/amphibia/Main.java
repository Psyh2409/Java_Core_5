package com.gmail.psyh2409.amphibia;

public class Main {
	public static void main(String[] args) {
		Amphibia amphibia = new Frog();
		amphibia.eat();
		amphibia.sleep();
		amphibia.walk();
		amphibia.swim();
	}
	/*Output:
Eating
Sleeping
Walking
Swimming
	 * */
}
