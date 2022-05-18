package com.masai;

public class VowelAndConso {
	void checkVowel(char ch){
		if(ch=='@' || ch=='#' || ch=='$' || ch=='%') {
			System.out.println("Error");
		}
		else if(ch =='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

	public static void main(String[] args) {
		VowelAndConso vc = new VowelAndConso();
		vc.checkVowel('A');
		vc.checkVowel('b');
		vc.checkVowel('#');

	}

}
