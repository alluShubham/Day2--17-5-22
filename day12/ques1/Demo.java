package com.masai.day12.ques1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Demo {
	public static void main(String[] args) {
		int count  =0;
		Pattern p1 = Pattern.compile("Java");
		Matcher m1 = p1.matcher("Java is a high-level, class-based, object-oriented programming language that is designed to have\r\n"
				+ "\r\n"
				+ "as few implementation dependencies as possible. It is a general-purpose programming language\r\n"
				+ "intended to let programmers write once, run anywhere (WORA),\r\n"
				+ "meaning that compiled Java code");
		
		while(m1.find()) {
			count++;
			System.out.println(m1.start()+"-----"+m1.end()+"-----"+m1.group());
			
		}
		System.out.println("No of occurance"+count);
	}
}
