package com.masai.day10.ques2;

public class AllStudents {

	public static void main(String[] args) {
		HistoryStudent h1 = new HistoryStudent("Allu","Hyd");
		h1.civicsMarks=80;
		h1.historyMarks=70;
		System.out.println(h1.getPercentage());

	}

}
