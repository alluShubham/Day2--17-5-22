//ques 4-04


package U4C1;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack h1 = new HatchBack();
			h1.setNumberOfKms(numberOfKMs);
			return h1;
		}
		else {
			Car s1 = new Sedan();
			s1.setNumberOfKms(numberOfKMs);
			return s1;
		}
		
	}
	
	public int calculateBill(Car car) {
		int total = car.getNumberOfKms()*car.farePerKm;
		return total;
	}

}
