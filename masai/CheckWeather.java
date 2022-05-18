package com.masai;

public class CheckWeather {

	public static void main(String[] args) {
		boolean isSnowing =true;
		boolean isRaining = true;
		double temperature = 50.0;
		if(isRaining == true && isSnowing ==true && temperature <= 50.0) {
			System.out.println("Let’s stay home.");
		}
		else
			System.out.println("Let’s go out!");

	}

}
