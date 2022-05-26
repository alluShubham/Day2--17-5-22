package day07;

public class AxisBank extends Bank{
	double rateOfInterest;

	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("Rate Of Interest:"+this.rateOfInterest);
//		System.out.println("IFSC:"+this.IfscCode);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	

}
