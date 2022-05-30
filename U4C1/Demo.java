// Ques 2-02

package U4C1;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of Student Object:");
		Student[] s1 = new Student[scn.nextInt()];
		
		for (int i = 0; i < s1.length; i++) {
			s1[i] = new Student();
		}
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Enter The details of Student"+(i+1));
			
			System.out.println("Enter roll:");
			s1[i].setRoll(scn.nextInt());
			
			System.out.println("Enter Marks:");
			s1[i].setMarks(scn.nextInt()); scn.nextLine();
			
			System.out.println("Enter Name:");
			s1[i].setName(scn.nextLine()); //scn.nextLine();
			
			System.out.println("Enter Address:");
			s1[i].setAddress(scn.nextLine());
		}
		int sum=0;
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Student Details"+(i+1));
			
			System.out.println("Name:"+s1[i].getName());
			System.out.println("Roll:"+s1[i].getRoll());
			System.out.println("Marks:"+s1[i].getMarks());
			System.out.println("Address:"+s1[i].getAddress());
			System.out.println("==========================================");
			sum =sum+s1[i].getMarks();
		}
		System.out.println("Average of Marks:"+sum/s1.length);
	}
}
