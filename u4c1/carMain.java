//Make a main class and inside that make two Car objects one with no-Argument Constructor and 
//other with the
//Parameterised Constructor.



package com.masai.u4c1;

public class carMain {

	public static void main(String[] args) {
		Car c1 =new Car();
		c1.model="Harrier";
		c1.companyName="TATA";
		c1.Color="Black";
		c1.engine= new Engine();
		c1.engine.rmp=10000;
		c1.engine.Power=110;
		c1.engine.manufacturer="tata";
		c1.engine.enableTurbo(true);
		
//		System.out.println("main");
		System.out.println("Car Model:"+c1.model);
		System.out.println("Car companyName:"+c1.companyName);
		System.out.println("Car color:"+c1.Color);
		System.out.println("Car RPM"+c1.engine.rmp);
		System.out.println("Car power:"+c1.engine.Power);
		System.out.println("Car Engine Manufacture:"+c1.engine.manufacturer);
		System.out.println("Car Has Turbo:"+c1.engine.hasTurbo);
		

			
		}
	

}
