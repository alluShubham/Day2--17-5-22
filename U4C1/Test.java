package U4C1;

public class Test {
	public static void main(String[] args) {
		OLA myOla = new OLA();
		Car book =myOla.bookCar(4, 20);
		int res  =myOla.calculateBill(book);
		
		System.out.println(res);
	}

}
