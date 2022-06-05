package com.masai.day12.ques2;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) && Pattern.matches("[a-zA-Z]{7}", name) && Pattern.matches("[0-9]{12}", aadharCard)) {
			System.out.println("Name :"+name);
			System.out.println("Mobile :"+mobileNum);
			System.out.println("Adhaar No:"+aadharCard);
			return true;
		}
		else {
			System.out.println("Invaild Details");
			return false;
		}
	}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Citizen cz= new Citizen();
		cz.setMobileNumber("7717765365");
		cz.setAadharNumber("888877779999");
		cz.setName("Shubham");
		
		if(cz.getName().length()==7 && cz.getAadharNumber().length()==12 && cz.getMobileNumber().length()==10) {
			d1.validate(cz.getName(), cz.getMobileNumber(), cz.getAadharNumber());
		}
		else {
			System.out.println("PLEASE GIVE PROPER DETAILS");
		}
	}
}
