package com.masai.day11.ques3;

import java.util.Scanner;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		if(Stadium.EDEN_GARDENS_STADIUM==stadium) {
			System.out.println("This is the home ground of KKR");
		}
		else if(Stadium.CHIDAMBARAM_STADIUM==stadium) {
			System.out.println("This is the home ground of CSK");
		}
		else if(Stadium.WANKHEDE_STADIUM ==stadium) {
			System.out.println("This is the home ground of Mumbai Indians");
		}
		else if(Stadium.M_CHINNASWAMY_STADIUM ==stadium) {
			System.out.println("This is the home ground of RCB");
		}
		else {
			System.out.println("Please enter valid Stadium name:");
		}
	}
	
	public static void main(String[] args) {
		IPL i = new IPL();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Stadium Name");
		
		String sname =scn.next();
		
		Stadium std =Stadium.valueOf(sname);
//		Stadium s1 = Stadium.CHIDAMBARAM_STADIUM;
		i.homeTeamStadium(std);
	}
}
