package day07;

public class Test1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		e1.age=25;
		e1.address="Patna";
		e1.name="Allu";
		e1.salary =25000;
		e1.specialisation="Java Backend";
		
		m1.age=25;
		m1.address="Hyedrabad";
		m1.name="Arjun";
		m1.salary =35000;
		m1.department="Telecom";
		System.out.println("for employee");
		System.out.println("Age:"+e1.age);
		System.out.println("NAME:"+e1.name);
		System.out.println("Address:"+e1.address);
		System.out.println("Special:"+e1.specialisation);
		e1.printSalary();
		System.out.println("================================================");
		System.out.println("for Manager");
		System.out.println("Age:"+m1.age);
		System.out.println("NAME:"+m1.name);
		System.out.println("Address:"+e1.address);
		System.out.println("Special:"+m1.department);
		m1.printSalary();

	}

}
