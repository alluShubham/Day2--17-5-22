//Class Car has following fields-
//Class Engine has following fields-




package com.masai.u4c1;

public class Car {
	String model;
	String companyName;
	String Color;
	Engine engine;
	

}

 class Engine {
	int rmp;
	int Power;
	String manufacturer;
	Boolean hasTurbo;
	
	public void enableTurbo(Boolean value) {
		this.hasTurbo=value;
	}
	
	

}
