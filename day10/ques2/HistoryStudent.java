package com.masai.day10.ques2;

public class HistoryStudent extends Student {
	
	int historyMarks,civicsMarks;

	public HistoryStudent(String name, String address) {
		super(name, address);
	}

	@Override
	int getPercentage() {
		
		return (int)(historyMarks+civicsMarks)/2;
	}

}
