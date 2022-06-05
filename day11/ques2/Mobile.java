package com.masai.day11.ques2;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String company ,String...  model) {
		int count =0;
		for (String x : model) {
			for (String string : outdatedModels) {
				if(x==string) {
					System.out.println(x+"_OUTDATED");
					count++;
				}
				
			}
		}
		if(count==0) {
			System.out.println("is new model");
		}
		
	}
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.searchOutdatedModel("Nokia", "note");
	}

}
