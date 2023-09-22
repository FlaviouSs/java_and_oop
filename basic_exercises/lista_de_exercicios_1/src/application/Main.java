package application;

import entities.Cat;

public class Main {

	public static void main(String[] args) {
		
		Cat garfield = new Cat("Garfield", 5, "Orange", true);
		Cat tom = new Cat("Tom", 2, "Grey", true);
		Cat frajola = new Cat("Frajola", 8, "Black", false);
		
		System.out.println(garfield.toString());
		System.out.println(tom.toString());
		System.out.println(frajola.toString());
		
	}

}
