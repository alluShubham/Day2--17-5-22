package com.masai.day10.ques2;

public class ScienceStudent extends Student {
	
	int phisicsMarks,chemistryMarks,mathsMarks;

	public ScienceStudent(String name, String address) {
		super(name, address);
			
	}

	@Override
	int getPercentage() {
		return (int)((phisicsMarks+chemistryMarks+mathsMarks)/3);
	}

	

}
