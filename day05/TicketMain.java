package com.masai.day05;
//Que2-02
import java.util.Scanner;
public class TicketMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Ticket t1 = new Ticket();
		System.out.println("Enter Available tickets");
		t1.setAvailableTickets(scn.nextInt());
		
		System.out.println("Enter Ticket ID:");
		t1.setTicketid(scn.nextInt());
		
		System.out.println("Enter price");
		t1.setPrice(scn.nextInt());
		
		System.out.println("Enter No of Tickets");
		int ticket = scn.nextInt();
		
		System.out.println(t1.calculateTicketCost(ticket));

	}

}
