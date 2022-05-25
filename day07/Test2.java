package day07;

public class Test2 {

	public static void main(String[] args) {
		DayScholar ds =new DayScholar();
		Hosteller h1 = new Hosteller();
		ds.examFee=1000;
		System.out.println("Amount to be paid for DayScholar:"+ds.payFee(300));
		h1.examFee=2000;
		System.out.println("Amount to be paid for Hosteller:"+h1.payFee(1300));

	}

}
