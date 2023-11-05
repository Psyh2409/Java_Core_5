package com.gmail.psyh2409.animals;

public abstract class Pet {
	public abstract void voice();
	
	public static void main(String[] args) {
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();
    }
	/*Output:
I'm Cow - I say Moooooo-Moooooo!
I'm Cat - I say Miaoooooo-Miaoooooo!
I'm Dog - I say Woof-Woof!
	 * */
}
