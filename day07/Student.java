package day07;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	double payFee(double fee) {
		return examFee-fee;
	}
	public Student() {
		
	}
	void displayDetails() {
		System.out.println("Name:"+this.studName);
		System.out.println("Id:"+this.studId);
		System.out.println("Examfee:"+this.examFee);
	}
}
