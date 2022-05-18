package com.masai;

public class CricketScore {
	 void score(int ones, int twos, int threes, int fours, int sixes) {
		int sum =0;
		sum =ones*1+twos*2+threes*3+fours*4+sixes*6;
		System.out.println("Total Score by Batsman:"+sum);
	}
	public static void main(String[] args) {
		CricketScore Cs = new CricketScore();
		Cs.score(10,5,2,4,3);
	}

}
