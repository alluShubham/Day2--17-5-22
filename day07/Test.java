package day07;

public class Test {
	static int number =20;
	public static void main(String[] args) {
		ConsolePrinter cp = new ConsolePrinter();
		Printer p1 =new ConsolePrinter();
		Printer p2 =new FilePrinter();
		cp.print();
		System.out.println(p1.number);
		p1.print();
		p2.print();

	}

}
