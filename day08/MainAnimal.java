package com.masai.day08;

public class MainAnimal {

	public static void main(String[] args) {
		Animal[] an = new Animal[3];
		an[0] = new Dog();
		an[1] = new Cat();
		an[2] = new Tiger();
		for(Animal x:an) {
			x.makeNoise();
		}
	}

}
