package com.masai.day21.ques1;

public class Calculate implements Runnable {
	int sum =1;

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			sum*=i;
		}
		System.out.println(sum);
	}

}
